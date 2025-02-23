package com.manjeet.collection;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(5);
        list.add(80);
        list.add(2,10);
        System.out.println(list.size());
        System.out.println(list);

        String[] str={"Apply","cherry","banana"};
        List<String> list1 = Arrays.asList(str);
        List<String> arrayList = new ArrayList<>(list1);
        arrayList.add(" mango");
        System.out.println("arrayList : "+arrayList);
        boolean mango2 = arrayList.add("mango");
        System.out.println("mango2 : "+mango2);
        boolean mango1 = arrayList.remove("mango");
        System.out.println("mango1 :"+mango1);
        System.out.println("arrayList"+arrayList);
        boolean mango = arrayList.contains("mango");
        System.out.println("mango : "+mango);
        System.out.println("arrayList "+arrayList);

        Object[] array = arrayList.toArray();
        String string = array.toString();
        System.out.println("array : "+string);

        Collections.sort(arrayList);
        System.out.println("sort arrayList : "+arrayList);
    }
}
