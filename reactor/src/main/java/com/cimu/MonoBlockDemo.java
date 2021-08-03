package com.cimu;

import org.apache.commons.lang3.StringUtils;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.function.Consumer;

public class MonoBlockDemo {

    public static void main(String[] args) throws InterruptedException {
        Consumer<String> consumer = str -> {
            if (StringUtils.isNotBlank(str)) {
                System.out.println(str.toUpperCase());
            } else {
                System.out.println("parameters is null");
            }
        };
        consumer.accept("Is People Animal?");
        Consumer<String> consumer1 = consumer.andThen(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s + "_then_");
            }
        });
        consumer1.accept("1111");
        Mono<String> mono = getInteger();
        System.out.println("MonoBlockDemo.main");
//        String block = mono.block();
        System.out.println("MonoBlockDemo.main");
        System.out.println(mono);
        Thread.sleep(6000);
        System.out.println(mono);
    }

    public static Mono<String> getInteger() {
        Mono<String> mono = Mono.just("111").delayElement(Duration.ofSeconds(5));
        return mono;
    }
}
