package com.manjeet.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringComparator implements Comparator<String> {


    @Override
    public int compare(String s1, String s2) {
        return s2.length()-s1.length();
    }
}

class IntegerComparator implements Comparator<Integer>{

    @Override
    public int compare( Integer i1, Integer i2) {
        return i1-i2 ;
    }
}
public class Test1 {

    public static void main(String[] args)  {

        List<String> list = Arrays.asList( "ABCC",  "XYZZZ", "MNOOOO", "PQR", "DEF", "STU");
        ArrayList<String> stringsList = new ArrayList<>(list);
        stringsList.add(" MANGOOOO");
        stringsList.add("BANANA");
        stringsList.add("CHERRYYY");
        System.out.println("stringsList : "+stringsList);

        stringsList.sort(new StringComparator());

        System.out.println("Sorted stringsList : "+ stringsList);
    }
}
