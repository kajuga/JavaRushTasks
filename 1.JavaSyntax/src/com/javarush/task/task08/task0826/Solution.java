package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* 
Пять победителей
*/

public class Solution {
        public static void main(String[] args) throws Exception {
            Integer[] array = new Integer[20];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 10);
                System.out.print(array[i] + " ");
            }
            System.out.println();

            Arrays.sort(array, Collections.reverseOrder());
            int counter = 0;

            while (counter <= 5) {
                for (int i = 0; i < array.length; i++) {
                if (array[i] != array[i + 1]) {
                    System.out.println(array[i]);
                    counter++;
                }

                }

            }

            }

        }
