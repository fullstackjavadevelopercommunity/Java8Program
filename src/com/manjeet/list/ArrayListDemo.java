package com.manjeet.list;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Manjeet", "Sanjeet", "Ranjeet", "RAju", "Satish", "Nitish", "Jyotish", "Kaushal", "Sonu");

        ArrayList<String> arrayList = new ArrayList<>(list);

        //1 way
        Iterator<String> iterator = arrayList.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //2 way
        for(String s : arrayList)
            System.out.println(" ArrayList " + s);
        //3 way
        arrayList.forEach(System.out::println);
        //4 way
        arrayList.forEach(e-> System.out.println("e : "+e));


        String[] str={"Manjeet", "Sanjeet", "Ranjeet", "RAju", "Satish", "Nitish", "Jyotish", "Kaushal", "Sonu"};


        List<String> list1 = Arrays.asList(str);
        System.out.println(list1);

        ArrayList<String> arrayList1 = new ArrayList<>();
        Collections.addAll(arrayList1,str);
        System.out.println(arrayList1);

        //ArrayList arrayList2 = new ArrayList<>(List.asList(str));
        //System.out.println(arrayList2);


        List<String> stringList1 = Arrays.stream(str).collect(Collectors.toList());
        System.out.println(stringList1);
    }

}
