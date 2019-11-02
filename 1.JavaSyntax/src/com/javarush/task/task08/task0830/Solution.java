package com.javarush.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>(20);
        for (int i = 0; i < list.size(); i++) {
            list.add(generateString(new Random(), "fabcdersgh", 5));
            System.out.println(list.get(i));
        }
        Collections.sort(list);
        System.out.println(list);



    }




    public static String generateString(Random rng, String characters, int length)
    {
        char[] text = new char[length];
        for (int i = 0; i < length; i++)
        {
            text[i] = characters.charAt(rng.nextInt(characters.length()));
        }
        return new String(text);
    }
}
