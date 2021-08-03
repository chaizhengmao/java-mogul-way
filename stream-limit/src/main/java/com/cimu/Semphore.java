package com.cimu;

import com.google.common.util.concurrent.RateLimiter;

/**
 * @author: zhengmao_chai
 * @date: 2021/6/2 9:39
 * @since: 1.0.0
 */
public class Semphore {

    public static void main(String[] args) {
        RateLimiter rateLimiter = RateLimiter.create(10);
        System.out.println("rateLimiter.getRate() = " + rateLimiter.getRate());
    }
}
