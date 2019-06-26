package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        divideByZero();
    }

    static void divideByZero() {
        try {
            System.out.println(3 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Ахтунг, деление на 0");
            e.printStackTrace();
        }
        System.out.println("Ошибка поймана, поехали дальше");
    }
}
