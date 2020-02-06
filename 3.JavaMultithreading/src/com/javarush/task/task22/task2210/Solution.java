package com.javarush.task.task22.task2210;

import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {

    }
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        String[] arr = new String[stringTokenizer.countTokens()];
        while (stringTokenizer.hasMoreTokens()) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = stringTokenizer.nextToken();
            }
        }
        return arr;
    }
}