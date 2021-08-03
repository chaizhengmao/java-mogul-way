package com.cimu;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class SubScribeDemo1 {

    public static void main(String[] args) {
        SampleSubscriber<Integer> ss = new SampleSubscriber<>();
        Flux<Integer> ints = Flux.range(1, 4);
        ints.subscribe(i -> System.out.println(i),
                error -> System.err.println("Error " + error),
                () -> {
                    System.out.println("Done");
                },
                s -> ss.request(10));
        ints.subscribe(ss);

        Flux<String> flux = Flux.generate(
                () -> 0,
                (state, sink) -> {
                    sink.next("3 x " + state + " = " + 3 * state);
                    if (state == 10) sink.complete();
                    return state + 1;
                });
        flux.subscribe(i -> System.out.println(i), error -> System.err.println("Error: " + error), () -> System.out.println("Done"));
        Flux<String> flux1 = Flux.generate(
                AtomicLong::new,
                (state, sink) -> {
                    long i = state.getAndIncrement();
                    sink.next("3 x " + i + " = " + 3 * i);
                    if (i == 10) sink.complete();
                    return state;
                }, (state) -> System.out.println("state: " + state));
        flux1.subscribe(i -> System.out.println(i), error -> System.err.println("Error: " + error), () -> System.out.println("Done"));

        Flux.range(1, 10000)
                .publishOn(Schedulers.elastic())
                .subscribe(i -> System.out.println(i));
    }
}

interface MyEventListener<T> {
    void onDataChunk(List<T> chunk);

    void processComplete();
}
