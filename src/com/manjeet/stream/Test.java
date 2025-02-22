package com.manjeet.stream;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        Stream<Integer> list=Stream.of(45,12,78,98,65,32);

        list.forEach(i-> System.out.print(i+" "));

    }
}
