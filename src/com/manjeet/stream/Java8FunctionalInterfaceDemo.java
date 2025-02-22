package com.manjeet.stream;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;

public class Java8FunctionalInterfaceDemo {

    public static void main(String[] args) {

        //Predicate--> Functional Interface -->Boolean Valued function
        //1. test() method is anstract method return boolean true or false
        //2. and() method is default method and check both condition is true then return true else false
        //3. or() method is default method and check if one condition is true then return true else false
        //4. negate() method is default method and it is for reverse the condition
        //5. isEqual() method is static method

       Predicate<Integer> isEven = x-> x % 2 == 0;
        System.out.println(isEven.test(10));

        Predicate<String> isWordStartsWithA= x->x.toLowerCase().startsWith("a");
        Predicate<String> isWordsEndWithT = x->x.toLowerCase().endsWith("t");

        System.out.println(isWordStartsWithA.and(isWordsEndWithT).test("Akshit"));
        System.out.println(isWordStartsWithA.and(isWordsEndWithT).test("Manjeet"));

        System.out.println(isWordStartsWithA.or(isWordsEndWithT).test("Sanjeet"));

        System.out.println(isWordStartsWithA.negate().test("Skshit"));

        System.out.println(isWordStartsWithA.negate().test("Skshit"));

        boolean rAm = Predicate.isEqual("RAM").test("RAM");
        System.out.println(rAm);

        //Function --> Functional Interface -->
        //1.apply() method is abstact method and take input and do something and return the result
        //2.andThen() method is default method and perform first then second
        //3.compose() method is default method and perform second then first
        //4.identity() method is static method and executed and return same as input

        Function<Integer, Integer> sum=x-> x + x;
        Function<Integer,Integer> doubleInt = x-> x * 2;
        Function<Integer,Integer> triple=x-> x * 3;

    }
}
