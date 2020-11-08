package com.liang.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-11-05 2020/11/5
 */
@Service  //将服务发布出去，注意这是dubbo的Service,不要导错包了
@Component //放在Sprig 容器中
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "<< Java >>";
    }
}
