package com.elastic.cn.indexmanager.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.elastic.cn.indexmanager.domain.User;
import com.elastic.cn.indexmanager.service.IUserService;
  

/**
 * Created by shushuwang on 2016-1-14
 */
@Controller  
@RequestMapping("/user")  
public class UserController {  
    @Resource(name="userService")
    private IUserService userService;  
      
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        User user = this.userService.selectByPrimaryKey(userId);  
        model.addAttribute("user", user);  
        return "showUser"; 
    }
}
