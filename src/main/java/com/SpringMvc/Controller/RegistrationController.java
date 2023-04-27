package com.SpringMvc.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringMvc.Model.User;
import com.SpringMvc.Services.UserService;

@Controller
public class RegistrationController {
	@Autowired
	private UserService userService;

	@RequestMapping("/registration")
	public String showForm() {

		return "Registration";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		System.out.println(user);
		int id = this.userService.createUser(user);
		model.addAttribute("id", id);
		return "success";
	}

	/*
	 * @RequestMapping(path="/processform", method = RequestMethod.POST) public
	 * String handleForm(@RequestParam("email") String userEmail,
	 * 
	 * @RequestParam("username") String userName,
	 * 
	 * @RequestParam("password") String userPwd, Model model) {
	 * 
	 * // System.out.println("User Email:"+userEmail); //
	 * System.out.println("User Name:"+userName); //
	 * System.out.println("User Password:"+userPwd); User u=new User();
	 * u.setEmail(userEmail); u.setUsername(userName); u.setPassword(userPwd); //
	 * model.addAttribute("email",userEmail); //
	 * model.addAttribute("userName",userName); //
	 * model.addAttribute("userPassword",userPwd); model.addAttribute("user",u);
	 * return "success"; }
	 */
}
