package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

/* 
Пять победителей
*/

public class Solution {
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Integer[] array = new Integer[20];
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(reader.readLine());
            }

            sort(array);

            System.out.println(array[0]);
            System.out.println(array[1]);
            System.out.println(array[2]);
            System.out.println(array[3]);
            System.out.println(array[4]);
        }

        public static void sort(Integer[] array) {
            //напишите тут ваш код
            Arrays.sort(array, Collections.reverseOrder());

        }
    }