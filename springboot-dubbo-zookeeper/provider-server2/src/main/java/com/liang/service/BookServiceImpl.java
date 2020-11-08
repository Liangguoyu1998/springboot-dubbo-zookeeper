package com.liang.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-11-05 2020/11/5
 */
@Service
@Component
public class BookServiceImpl implements BookService {
    @Override
    public String getBook() {
        return "<< MySQL >>";
    }
}
