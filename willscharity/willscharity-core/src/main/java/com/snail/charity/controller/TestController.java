package com.snail.charity.controller;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.snail.charity.vo.UserVo;

@Controller
public class TestController {
	@RequestMapping("/test")
    public @ResponseBody String index() {
        UserVo user = new UserVo();
        
        user.setName("snail");
        user.setAge(26);
        user.setEmail("luqu@live.cn");
        String str = JSONObject.fromObject(user).toString();
        System.out.println("str="+str);
        
        return str;
    }
}
