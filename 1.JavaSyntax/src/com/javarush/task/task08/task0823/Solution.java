package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String text = "мама мыла раму";
        String [] arr = text.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].substring(0,1).toUpperCase() + arr[i].substring(1);
            System.out.print (arr[i] + " ");
        }
        //напишите тут ваш код
        //можно стрингбилдером, но хренсним, пока пусть так захордкожено будет
    }
}