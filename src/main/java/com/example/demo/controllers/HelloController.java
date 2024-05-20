package com.example.demo.controllers;

import com.example.demo.entities.SanPham;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @Autowired
    @Qualifier("beanSP1")
    private SanPham sp;

    @RequestMapping("hello")
    public String sayHello()
    {

        System.out.println(sp.getMa());
        System.out.println(sp.getTen());
        System.out.println(sp.getTrangThai());
        return "hello";
    }
}
