package com.cimu;

import com.google.common.util.concurrent.RateLimiter;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author: zhengmao_chai
 * @date: 2021/6/2 9:54
 * @since: 1.0.0
 */
public class RateLimterDemo {

    public static void main(String[] args) {
        RateLimiter rateLimiter = RateLimiter.create(10, 2, TimeUnit.SECONDS);
        System.out.println("rateLimiter.getRate() = " + rateLimiter.getRate());
        while (true) {
            double acquire = rateLimiter.acquire();
            System.out.println(new Date().toLocaleString() + "--->" + acquire);
        }
    }
}
