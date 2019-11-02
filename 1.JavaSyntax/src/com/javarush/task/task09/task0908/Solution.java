package com.javarush.task.task09.task0908;

/* 
Исключение при работе со строками
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            method();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println("continue");
    }

    public static void method() {
        String s = null;
        String m = s.toLowerCase();
        System.out.println(m);
    }
}