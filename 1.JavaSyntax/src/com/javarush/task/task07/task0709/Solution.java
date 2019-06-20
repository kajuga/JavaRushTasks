package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int min = list.get(0).length();
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
            if (min < list.get(i).length()) {
                min = list.get(i).length();
            }
        }
        for (String str: list
             ) {
            if (str.length() == min) {
                System.out.println(str);
            }
        }
    }
}
