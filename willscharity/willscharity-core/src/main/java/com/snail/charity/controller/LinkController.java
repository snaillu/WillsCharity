package com.snail.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LinkController {
	private String authorizationUrl ="/pages/authorization";
	
	//index page
	@RequestMapping("/index")
	public ModelAndView index(){
		ModelAndView view = new ModelAndView("/index");
        return view;
	}
		
	//user register
	@RequestMapping("/join")
	public ModelAndView join(){
		ModelAndView view = new ModelAndView(authorizationUrl+"/register");
        return view;
	}
	
	//user login
	@RequestMapping("/login")
	public ModelAndView login(){
		ModelAndView view = new ModelAndView(authorizationUrl+"/login");
        return view;
	}
}
