package com.javarush.task.task04.task0410;

/* 
Попадём-не-попадём
*/

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int a) {
        String result = a >= 50 & a <= 100 ? "Число " + a + " содержится в интервале" :  "Число " + a + " не содержится в интервале";
        System.out.println(result);
        //напишите тут ваш код
    }
}