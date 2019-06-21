package com.javarush.task.task08.task0827;

import java.util.Calendar;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
        Date date = new Date();
        System.out.println(date);
    }

    public static boolean isDateOdd(String date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(date));
        int b = calendar.get(calendar.DAY_OF_YEAR);
        if (b % 2 == 0) {
            return  false;
        }
        return true;
    }
}
