package com.manjeet.string;

public class Test {

    //1.Write a function to find out duplicate words in a given string?
    public static void main(String[] args) {

        String string = "Big black bug bit a big black dog on his big black nose";
        int count;
        String stringLowerCase = string.toLowerCase();

        String[] split = stringLowerCase.split(" ");

        System.out.println("---Duplicates Strings---");

        for (int i=0; i < split.length; i++){

            count=1;
            for (int j=i+1; j< split.length; j++){
                if (split[i].equals(split[j])) {
                    count++;

                    split[j]="0";
                }

            }

            //Displays the duplicate word if count is greater than 1
            if(count > 1 && split[i] != "0")
                System.out.println(split[i]);
        }
    }
}
