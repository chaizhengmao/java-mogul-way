package com.cimu;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

public class SampleSubscriber<T> extends BaseSubscriber<T> {
    @Override
    protected void hookOnSubscribe(Subscription subscription) {
        System.out.println("SampleSubscriber.hookOnSubscribe");
        request(2);
    }

    @Override
    protected void hookOnNext(T value) {
        System.out.println("SampleSubscriber.hookOnNext");
        System.out.println(value);
        request(3);
    }
}
