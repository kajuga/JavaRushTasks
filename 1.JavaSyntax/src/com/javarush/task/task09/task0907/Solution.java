package com.javarush.task.task09.task0907;

/* 
Исключение при работе с числами
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            System.out.println("Start ");
            method();
            System.out.println("After method calling: ");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        }
        System.out.println("& program still running");

    }

        public static  void method () {

        int a = 42 / 0;
            System.out.println(a);
        //напишите тут ваш код
    }
}
