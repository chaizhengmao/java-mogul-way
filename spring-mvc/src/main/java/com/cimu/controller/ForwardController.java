package com.cimu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: zhengmao_chai
 * @date: 2021/6/29 11:28
 * @since: 1.0.0
 */
@Controller
@RequestMapping("forward")
public class ForwardController {
    @PostMapping("/post")
    public String postForward(String name, Model model) {
        System.out.println("ForwardController.postForward");
        model.addAttribute("msg", "ForwardController.postForward");
        model.addAttribute("name", name);
        // Request method 'POST' not supported\r\n\tat org.springframework.web.
        // reslove
        return "login";
//        return "forward:/login";
    }

    @GetMapping("/get")
    public String getForward(String name, Model model) {
        System.out.println("ForwardController.getForward");
        model.addAttribute("msg", "ForwardController.getForward");
        model.addAttribute("name", name);
        return "forward:/login";
    }
}
