package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
         public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int[] arr = new int[10];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(reader.readLine());
            }
            printBack(arr);
        }


        public static void printBack(int[] array){
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.println(array[i]);
            }

        }
    }