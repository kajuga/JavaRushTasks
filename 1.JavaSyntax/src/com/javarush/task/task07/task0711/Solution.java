package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String>  list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {

            list.add(reader.readLine());
        }
        reader.close();


        for (int i = 0; i < 13; i++) {
            String temp = list.get(list.size() - 1);
            list.add(0, temp);
            list.remove(list.get(list.size() - 1));

        }

        for (String s: list
             ) {
            System.out.println(s);

        }


    }
}
