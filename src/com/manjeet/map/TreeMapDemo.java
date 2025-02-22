package com.manjeet.map;

import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        SortedMap<String,Integer> sortedMap=new TreeMap<>();
        sortedMap.put("Manjeet",101);
        sortedMap.put("Ranjeet",111);
        sortedMap.put("Sanjeet",121);
        sortedMap.put("Raju",131);
        sortedMap.put("Raju",141);
        sortedMap.put("Satish",151);
        sortedMap.put("Nitish",161);
        sortedMap.put("Jyotish",171);

        String firstKey1 = sortedMap.firstKey();
        System.out.println("firstKey : "+firstKey1);

        String lastKey1 = sortedMap.lastKey();
        System.out.println("lastKey : "+lastKey1);

        //SortedMap<String, Integer> sortedMap1 = sortedMap.headMap("Jyotish");
        System.out.println("sortedMap1 : "+sortedMap.headMap("Jyotish"));

        Set<Map.Entry<String, Integer>> sortedEntries = sortedMap.entrySet();
        for (Map.Entry<String, Integer> s : sortedEntries){
            System.out.println(s.getKey()+" : "+s.getValue());
        }

    }
}
