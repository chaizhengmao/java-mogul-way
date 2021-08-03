package com.cimu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author: zhengmao_chai
 * @date: 2021/6/29 10:15
 * @since: 1.0.0
 */
@Controller
@RequestMapping("/redirect")
public class RedirectController {

    @PostMapping("/post")
    public String postRedrect(String name, RedirectAttributes attributes) {
        System.out.println("RedirectController.postRedrect");
        attributes.addFlashAttribute("msg", "RedirectController.postRedrect");
        attributes.addFlashAttribute("name", name);
        return "redirect:/login";
    }

    @GetMapping("/get")
    public String getRedrect(String name, RedirectAttributes attributes) {
        System.out.println("RedirectController.getRedrect");
        attributes.addFlashAttribute("msg", "RedirectController.getRedrect");
        attributes.addFlashAttribute("name", name);
        return "redirect:/login";
    }
}
