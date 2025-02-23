package com.manjeet.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(101,"Manjeet");
        map.put(111,"Ranjeet");
        map.put(121," Sanjeet");
        map.put(131,"Raju");
        map.put(141,"Raju");
        map.put(151,"Satish");
        map.put(161,"Nitish");
        map.put(171,"Jyotish");
        System.out.println("map : "+map);

        Set<Integer> keySet = map.keySet();

        for (Integer i:keySet){
            System.out.println("Keys : "+i);
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for (Map.Entry<Integer, String> i: entries){
            System.out.println("Key : "+i.getKey()+" "+" Value : "+i.getValue());
           // System.out.print("Key : "+i.getKey()+" "+" Value : "+i.getValue().toUpperCase());
        }

        HashMap<Integer,String> hashMap=new HashMap<>();

        Thread thread1 =new Thread(() ->{
            for (int i=0; i<100; i++){
                hashMap.put(i,"Thread 1");
                System.out.println("Thread 1");
               // try {
                   // Thread.sleep(500);
               // } catch (InterruptedException e) {
                 //   throw new RuntimeException(e);
               // }
            }
        });

        Thread thread2 =new Thread(() ->{
            for (int i=100; i<200; i++){
                hashMap.put(i,"Thread 2");
                System.out.println("Thread 2");
                //try {
                    //Thread.sleep(500);
                //} catch (InterruptedException e) {
                //    throw new RuntimeException(e);
               // }
            }
        });

        thread1.start();
       thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Final Size of HashMap : "+hashMap.size());

        Set<Map.Entry<Integer, String>> entries1 = hashMap.entrySet();

        for (Map.Entry<Integer, String> i: entries1){
            System.out.println("Key : "+i.getKey()+" "+" Value : "+i.getValue());
        }
    }
    }



