package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<String> str = Arrays.asList(new String[]{"dff", "sdsdffsf", "dfsdfdfsfff", "df", "sdsddsdfsfsfsffsf"});

        int index =  str.get(0).length();
        for (int i = 0; i < str.size(); i++) {
            if(index <= str.get(i).length()) {
                index = str.get(i).length();
            } else
                System.out.println(str.get(i));
            }
        }
    }