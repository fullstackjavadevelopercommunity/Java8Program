package com.manjeet.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put(101,"Manjeet");
        linkedHashMap.put(111,"Ranjeet");
        linkedHashMap.put(121,"Sanjeet");
        linkedHashMap.put(131,"Raju");
        linkedHashMap.put(141,"Raju");
        linkedHashMap.put(151,"Satish");
        linkedHashMap.put(161,"Nitish");
        linkedHashMap.put(171,"Jyotish");
        System.out.println("linkedHashMap : "+linkedHashMap);
        Set<Map.Entry<Integer, String>> entries = linkedHashMap.entrySet();

        for (Map.Entry<Integer, String> s:entries){
            System.out.println(s.getKey()+ " : "+s.getValue());
        }
    }
}
