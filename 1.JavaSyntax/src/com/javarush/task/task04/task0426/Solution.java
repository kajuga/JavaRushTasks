package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        valueChecker(-6);
    }


    static void valueChecker(int a) {
        if (a != 0) {
            if (a % 2 == 0) {
                System.out.println(plusMinusChecker(a) + " четное число");
            } else {
                System.out.println(plusMinusChecker(a) + " нечетное число");
            }

        } else {
            System.out.println("ноль");
        }
    }

    static String plusMinusChecker(int a) {
        return (a < 0 ? "отрицательное" : "положительное");
    }

}
