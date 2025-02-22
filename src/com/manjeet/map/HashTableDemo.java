package com.manjeet.map;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {

    public static void main(String[] args) {

        Hashtable<Integer,String> hashtable=new Hashtable<>();

        Thread thread1 =new Thread(() ->{
            for (int i=0; i<1000; i++){
                hashtable.put(i,"Thread 1");
            }
        });

        Thread thread2 =new Thread(() ->{
            for (int i=1000; i<2000; i++){
                hashtable.put(i,"Thread 2");
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

        System.out.println("Final Size of HashTable : "+hashtable.size());

    }
}
