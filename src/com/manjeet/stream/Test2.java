package com.manjeet.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test2 {

    public static void main(String[] args) {

        Integer[] arr = {77,44,55,88,99,15,45,35,85,62,47,68,42,46};
        Stream<Integer> stream = Arrays.stream(arr).sorted();
        stream.forEach(System.out::println);
    }
}
