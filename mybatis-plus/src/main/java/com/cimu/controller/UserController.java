package com.cimu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author: zhengmao_chai
 * @date: 2021/6/28 18:29
 * @since: 1.0.0
 */
@RestController
public class UserController {

    @GetMapping("/list")
    @RequestMapping
    public String list(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("msg", "redirect");
        System.out.println("UserController.list");
        return "UserController.list";
    }
}
