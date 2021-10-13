package com.docker.demo.controll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhengmao_chai
 * @date: 2021/10/13 11:04
 * @since: 1.0.0
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getHello(String name) {
        return "hello-->" + name;
    }
}
