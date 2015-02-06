package com.snail.charity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.snail.charity.service.IUserService;

@Controller
public class UserController {
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/queryuser")
	public ModelAndView queryAllUser(){
		System.out.println("queryAllUser controller");
		userService.queryAllUser();
		ModelAndView view = new ModelAndView("index");
        view.addObject("welcome", "hello");
        return view;
	}
}
