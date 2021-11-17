package com.users.userservice.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

//import com.users.userservice.entity.Contact;
import com.users.userservice.entity.User;
import com.users.userservice.exception.UserNotFoundException;
import com.users.userservice.service.UserService;



@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
//	
	@Autowired
	RestTemplate restTemplate;
    Logger logger = LoggerFactory.getLogger(this.getClass());

	
		@RequestMapping("/userreg")
	public String userRegister() {

		return "user";
		
		
	}
	@RequestMapping("/home")
	public String userHome() {
		return "home";
		
		
	}
	@RequestMapping("/login")
	public String userLogin(@RequestParam("uname") String uname,@RequestParam("pwd") String pwd, HttpSession session) {
		String viewName;
		if (userService.validateUser(uname,pwd, "admin")) {
			viewName="adminhome";
	        session.setAttribute("username", uname);
logger.info("user validated");
			
		}
		else {
			logger.error("credentials wrong");
			viewName="home";

		}
		return viewName;
		
	}
	@RequestMapping("/changepwd")
	public String changePassword() {		
		return "changepwd";
		
	}
	@RequestMapping("/updatepwd")
	public String updatePassword(@RequestParam("currpwd") String oldpwd,@RequestParam("newpwd") String newpwd, HttpSession session, ModelMap model) {
		String viewName;
//		RedirectAttributes attributes =new RedirectAttributes();
		String uname=(String)session.getAttribute("username");
		if (userService.updatePassword(uname,oldpwd, newpwd)) {
			model.addAttribute("message", "Password Changed.");
			logger.info("password changed");
			viewName="adminhome";
			
		}
		else {
			model.addAttribute("message", "Password not Changed.");

			throw new UserNotFoundException();

		}
		return viewName;
		
	}
	
	@RequestMapping("/usermgmt")
	public String manageUsers() {
	
		return "usermgmt";
		
	}
	@RequestMapping("/listusers")
	public String listUsers(ModelMap model) {
		model.addAttribute("users", userService.getAllUsers());

		return "userresult";
		
	}
	@RequestMapping("/getuser")
	public String getUser(@RequestParam("uname") String uname, ModelMap model){//HttpServletRequest req) {
		model.addAttribute("users", userService.searchUser(uname));
		
		return "userresult";
		
	}
	@RequestMapping("/manageproducts")
	public String manageproducts(){//HttpServletRequest req) {
		
		return "manageprd";
		
	}
	
}
