package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) { 
		// this can be used for common addition directly
		// so we don't need to add everything directly
		m.addAttribute("Header", "Learning Spring MVC");
		m.addAttribute("Desc", "This is tutorial of Code with Durgesh");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
		return "contact";
	}
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String getForm(@ModelAttribute User user,Model model) {
		int createdId = this.userService.createUser(user);
		model.addAttribute("msg", "User created with Id : "+createdId);
		return "success";
	}
	
	/*
	public String getForm(
			@RequestParam("useremail") String userEmail,
			@RequestParam("username") String userName, 
			@RequestParam("password") String password,
			Model model) {
		
		User user = new User();
		user.setUseremail(userEmail);
		user.setUsername(userName);
		user.setPassword(password);
		
		model.addAttribute("user", user);
		
		return "success";
	}
	*/
	
	/*
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String getForm(
			@RequestParam("useremail") String userEmail,
			@RequestParam("username") String userName, 
			@RequestParam("password") String password,
			Model model) {
		System.out.println(userEmail);
		System.out.println(userName);
		System.out.println(password);
		
		model.addAttribute("useremail", userEmail);
		model.addAttribute("username", userName);
		model.addAttribute("password", password);
		return "success";
	}
	*/
}
