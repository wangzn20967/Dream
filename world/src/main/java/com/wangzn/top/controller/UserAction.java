package com.wangzn.top.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wangzn.top.service.UserService;

@Controller
@RequestMapping("/user")


public class UserAction {
    @Autowired
    private UserService userService;
    
    @RequestMapping(value="/userlist.do",produces="text/html;charset=UTF-8" )   
    @ResponseBody  
    public String userList(){
        String list = userService.list(1);
        return list;  
        
    }
    
}
