package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = (reader.readLine()).split("\\s");
        for (int i = 0; i < strings.length; i++) {
            String uppka = strings[i].substring(0, 1).toUpperCase();
            strings[i] = uppka + strings[i].substring(1);
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }

        //напишите тут ваш код
    }
}
