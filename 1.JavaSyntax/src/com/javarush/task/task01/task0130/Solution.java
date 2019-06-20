package com.javarush.task.task01.task0130;

/* 
Наш первый конвертер!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(41));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
        //напишите тут ваш код TC = (TF - 32) * 5/9
        double fatenheit = (celsium * 9) / 5 + 32;
        return fatenheit;
    }
}