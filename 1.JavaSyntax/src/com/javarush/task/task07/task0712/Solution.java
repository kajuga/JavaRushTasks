package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
//        ArrayList<String> list = new ArrayList<>();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        for (int i = 0; i < 10; i++) {
//            list.add(reader.readLine());
//        }
//        int minLength = list.get(0).length();
//        int maxLength = list.get(0).length();
//        int minPos = 0;
//        int maxPos = 0;
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).length() < minLength) {
//                minLength = list.get(i).length();
//                minPos = i;
//            }
//            if (list.get(i).length() > maxLength) {
//                maxLength = list.get(i).length();
//                maxPos = i;
//            }
//        }
//        System.out.println(minPos < maxPos ? list.get(minPos) : list.get(maxPos));
//
//    }
        String[] strings = {"s2324as", "ssadadsdada", "32323", "qqwwq", "qwdqwwwq3321", "2334"};

        String [] minMax = Arrays.copyOf(strings, strings.length);

        for (int i= minMax.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(minMax[j].length() > minMax[j + 1].length()) {
                    String temp = minMax[j];
                    minMax[j] = minMax[j + 1];
                    minMax[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(minMax));

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() - minMax[0].length() == 0){
                System.out.println(minMax[0]);
                break;
            } if (strings[i].length() == minMax[5].length()){
                System.out.println(minMax[5]);
              break;
            }
        }



}
}
