package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(bufferedReader.readLine());
        if (value > 0) {
            System.out.println(value *= 2);
        } else if (value < 0) {
            System.out.println(++value);
        } else {
            System.out.println(value = 0);
        }
    }
}
