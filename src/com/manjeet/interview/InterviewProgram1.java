package com.manjeet.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewProgram1 {

    //2.Given a list of integers, find out all the numbers starting with 1 using Stream functions?
    public static void main(String[] args) {


        int[] arr={11,12,32,15,18,14,17,13,16,16,19,98,7,45,2365,899,5896,589,6,58,9};
        List<Integer> list = Arrays.asList(11,12,32,15,18,14,17,13,16,16,19,98,7,45,2365,899,5896,589,6,58,9);
        List<String> collect = list.stream().map(s -> s + "").filter(s -> s.startsWith("1")).collect(Collectors.toList());
        System.out.println("collect : "+collect);


        Arrays.stream(arr).boxed().map(x->x+"").filter(s->s.startsWith("1")).forEach(System.out::println);
    }
}
