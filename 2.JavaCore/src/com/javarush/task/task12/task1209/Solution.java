package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(min(23, 12));

    }

    //Напишите тут ваши методы
    static int min(int a, int b) {
        return a < b ? a : b;
    }
}
