package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] value = new int[10];
        String[] str = new String[10];
        for (int i = 0; i < str.length; i++) {
            str[i] = reader.readLine();
            value[i] = str[i].length();
        }

        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }
    }
}
