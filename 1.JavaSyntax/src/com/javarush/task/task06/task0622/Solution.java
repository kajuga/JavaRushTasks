package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer[] list = new Integer[5];

        for (int i = 0; i < 5; i++) {
            int temp = Integer.parseInt(bufferedReader.readLine());
            list[i] = temp;
        }

 Arrays.sort(list);
        for (int i = 0; i < 5; i++) {
            System.out.println(list[i]);
        }






    }
}