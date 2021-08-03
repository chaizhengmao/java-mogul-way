package com.cimu.sevurity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author: zhengmao_chai
 * @date: 2021/6/29 13:41
 * @since: 1.0.0
 */
public class PasswordHandle {

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encode = encoder.encode("123456");
        System.out.println(encode);
        System.out.println(encoder.matches("123456", encode));
    }
}
