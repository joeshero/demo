package com.project.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Qiao guorui
 * @Date 2021/2/1 10:40 下午
 */
@RestController
public class HomeCtrl {

    @GetMapping("/index")
    public String index() {
        return "hello world";
    }
}
