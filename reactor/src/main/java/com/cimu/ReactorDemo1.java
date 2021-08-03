package com.cimu;

import reactor.core.publisher.Mono;

public class ReactorDemo1 {

    public static void main(String[] args) {
        Mono<Object> mono = Mono.empty();
        Mono<Object> mono1 = mono.switchIfEmpty(Mono.just(22)).flatMap(item -> {
            System.out.println(item);
            return Mono.just(33);
        });
        Integer block = (Integer) mono1.block();
        System.out.println(block);
    }
}
