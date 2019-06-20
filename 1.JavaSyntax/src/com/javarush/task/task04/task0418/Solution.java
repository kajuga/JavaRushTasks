package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        minChecker(14, 25);
    }

    static void minChecker (int a, int b) {
        System.out.println(a <= b ? a : b);

    }
}