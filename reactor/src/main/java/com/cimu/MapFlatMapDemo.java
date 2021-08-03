package com.cimu;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class MapFlatMapDemo {

    public static void main(String[] args) {
        String[] words = new String[]{"Hello", "World"};
        List<String[]> a = Arrays.stream(words)
                .map(word -> word.split(""))
                .distinct()
                .collect(toList());
        a.forEach(System.out::print);
        System.out.println();

        List<String> b = Arrays.stream(words)
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(toList());
        b.forEach(System.out::print);
    }
}
