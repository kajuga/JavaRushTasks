package com.javarush.task.task09.task0909;

/* 
Исключение при работе с массивами
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            method2();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("CATCHED + " + e);
        }
    }

    public static void method2() {
        int[] m = new int[2];
        m[8] = 5;
    }
}


