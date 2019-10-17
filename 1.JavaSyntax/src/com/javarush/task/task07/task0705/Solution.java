package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {12, -23, 23, 323, -456, 123, 0, 11, 99, 115};
        int[] arr2 = Arrays.copyOf(arr, 5);
        int[] arr3 = Arrays.copyOfRange(arr, 5, 10);
        System.out.println(Arrays.toString(arr3));
    }
}