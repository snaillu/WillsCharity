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
	
	private String baesUrl ="/pages/authorization";
	
	public ModelAndView queryAllUser(){
		userService.queryAllUser();
		ModelAndView view = new ModelAndView(baesUrl+"/register");
        return view;
	}
}
