package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
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
}
