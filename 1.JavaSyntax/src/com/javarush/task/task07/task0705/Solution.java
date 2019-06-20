package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
            public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int[] arr = new int[20];
            int[] arr2 = new int[10];
            int[] arr3 = new int[10];


            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(reader.readLine());
            }

            for (int i = 0; i < arr.length/2; i++) {
                arr2[i] = arr[i];
                arr3[i] = arr[arr.length/2 + i];
            }
             print(arr3);

        }
            public static void print(int[] array){
            for (int i = 0; i < array.length; i++){
                System.out.println(array[i]);
            }
        }
    }