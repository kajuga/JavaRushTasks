package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(5467));
    }

    public static int sumDigitsInNumber(int number) {
        int result = 0;

        int temp = Integer.toString(number).length();
        for (int i = 0; i < temp; i++) {
            char z = (Integer.toString(number).charAt(i));
            int inner = Character.getNumericValue(z);
            result += inner;
        }
        return result;
    }

    public static int sumDigitsInNumberTwo(int number) {
       int summ = 0;
       int numberTemp = number;
        while (number % 10 != 0) {
           summ += number % 10;
           number = number / 10;

        }
        return summ;
    }
}