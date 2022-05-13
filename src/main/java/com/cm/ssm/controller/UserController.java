package com.cm.ssm.controller;

import com.cm.ssm.po.User;
import com.cm.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("queryUser")
    public String queryUserById(Integer id, HttpServletRequest request){
        User user = userService.queryUserById(id);
        request.setAttribute("user",user);
        return "ssm";
    }
}
