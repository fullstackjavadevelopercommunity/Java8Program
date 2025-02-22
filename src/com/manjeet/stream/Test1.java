package com.manjeet.stream;

import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Ram", "Shyam", "Ghanshyam", "Manjeet", "Ranjeet", "Sanjeet", "Raju");
        list.forEach(System.out::println);
    }
}
