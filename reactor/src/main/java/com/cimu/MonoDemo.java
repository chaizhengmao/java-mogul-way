package com.cimu;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

//@Slf4j
public class MonoDemo {

    public static void main(String[] args) {
        Flux<Object> empty = Flux.empty();
        Mono<Object> emptyMono = Mono.empty();
        Object emptyBlock = emptyMono.block();
        if (emptyBlock == null) {
            System.out.println("空值.......");
        }
        String format = String.format("token or deviceId is null, token:%s, deviceId:%s", "1111", "deviceId");
        System.out.println(format);
//        Mono<Object> errorMono = null;
//        try {
//            errorMono = Mono.error(new RuntimeException());
//            Object errorBlock = errorMono.block();
//            if (errorBlock instanceof Exception) {
//                System.out.println("异常。。。。");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
