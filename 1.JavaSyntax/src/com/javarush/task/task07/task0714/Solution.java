package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            ArrayList<String> list = new ArrayList<>();
//
//            for (int i = 0; i < 5; i++) {
//                list.add(reader.readLine());
//            }
//            list.remove(2);
//
//
//            for (int i = list.size() - 1; i >= 0; i--) {
//                System.out.println(list.get(i));
//            }
//
//        }
    ArrayList<String> string = new ArrayList<>(Arrays.asList("11111111111", "222222222", "333333333", "444444", "55555555"));
    string.remove(2);
        System.out.println(string);

        for (int i = string.size() - 1; i >= 0; i--) {
            System.out.print(string.get(i) + " ");
        }



    }
}