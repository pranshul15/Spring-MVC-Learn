package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name", "Ram Singh Chaddha");
		model.addAttribute("id",1438);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Vandan");
		friends.add("Roshni");
		friends.add("Rohit");
		
		model.addAttribute("f", friends);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about url");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help controller");
		// creating ModelAndView object
		ModelAndView modelAndView = new ModelAndView();
		
		// setting the data
		modelAndView.addObject("name","Ariana Grande");
		modelAndView.addObject("rollnumber",23442);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time",now);
		
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(34);
		marks.add(43);
		marks.add(85);
		marks.add(19);
		
		modelAndView.addObject("mark",marks);
		
		// setting the view name
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
