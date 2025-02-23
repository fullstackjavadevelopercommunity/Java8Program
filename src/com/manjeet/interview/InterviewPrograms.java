package com.manjeet.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewPrograms {

    //1.Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
    public static void main(String[] args) {

        int[] arr={7, 8, 3, 1, 5, 9, 12, 45, 78, 9, 8, 65, 3, 2};
        List<Integer> list = Arrays.asList(7, 8, 3, 1, 5, 9, 12, 45, 78, 9, 8, 65, 3, 2);

        List<Integer> collect = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("------------");
        list.stream().filter(x->x%2==0).forEach(System.out::println);
        System.out.println("---------------");
        Arrays.stream(arr).boxed().filter(x->x%2==0).forEach(System.out::println);
    }
}
