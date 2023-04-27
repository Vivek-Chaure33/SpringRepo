package com.SpringMvc.Controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.SpringMvc.Services.UserService;

@Controller
public class HomeController {
	
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Hello This is home url");
		model.addAttribute("id",20);
		model.addAttribute("name","Vivek Chaure");
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is About Page");
		
		return "about";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		
		System.out.println("Help Page");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name","Vivek Chaure");
		modelAndView.addObject("Id", 20);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		List al=new ArrayList();
		al.add("Vivek");
		al.add("Ajay");
		al.add("Nilesh");
		al.add("Sachin");
		modelAndView.addObject("namesList",al);
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
