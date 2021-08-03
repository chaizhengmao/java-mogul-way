package com.cimu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

/**
 * @author: zhengmao_chai
 * @date: 2021/7/1 9:43
 * @since: 1.0.0
 */
@Controller
public class AuthController {

    @GetMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        Arrays.stream(cookies).filter((item->{
            return false;
        }));
        Cookie cookie = new Cookie("", "");
        response.addCookie(cookie);
        return "login";
    }
}
