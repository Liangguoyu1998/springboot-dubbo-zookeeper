package com.liang.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-11-05 2020/11/5
 */
@org.apache.dubbo.config.annotation.Service
@Service
public class UserServiceImpl implements UserService {
    //我们需要去拿注册中心的服务
    @Reference //远程引用指定的服务，它会按照全类名进行匹配，看谁给注册中心注册了这个全类名
    TicketService ticketService;
    public void buyTicket(){
        String ticket = ticketService.getTicket();
        System.out.println("在注册中心买到"+ticket);
    }

}
