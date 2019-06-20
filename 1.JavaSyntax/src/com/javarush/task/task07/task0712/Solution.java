package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        int minLength = list.get(0).length();
        int maxLength = list.get(0).length();
        int minPos = 0;
        int maxPos = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < minLength) {
                minLength = list.get(i).length();
                minPos = i;
            }
            if (list.get(i).length() > maxLength) {
                maxLength = list.get(i).length();
                maxPos = i;
            }
        }
        System.out.println(minPos < maxPos ? list.get(minPos) : list.get(maxPos));

    }
}
