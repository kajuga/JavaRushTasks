package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            Date parsedDate = new SimpleDateFormat("yyyy-MM-dd").parse(reader.readLine());

            Calendar cal = Calendar.getInstance();
            cal.setTime(parsedDate);

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, YYYY");
            System.out.println(simpleDateFormat.format(cal.getTime()).toUpperCase());
        } catch (ParseException e) {
        }
    }
}




