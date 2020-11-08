package com.liang.controller;


import com.liang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-11-05 2020/11/5
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/buyTicket")
    public String buyTicket(){
        userService.buyTicket();
        return "ok,买到票了";
    }
}
