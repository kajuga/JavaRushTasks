package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        String input = new BufferedReader(new InputStreamReader(System.in)).readLine().substring(0, 1).toLowerCase();
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Map<String, Integer> month = new HashMap<>();
        for (int i = 0; i < monthNames.length; i++) {
            month.put(monthNames[i], i);
        }
        int currMonth = 0;
        if (month.containsKey(input)) {
            currMonth = month.get(monthNames) + 1;
        }
        System.out.println(input + " is " + currMonth + " month");
    }
}
