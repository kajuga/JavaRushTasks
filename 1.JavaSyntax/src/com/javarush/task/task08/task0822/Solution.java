package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        for (int i = 0; i < integerList.size(); i++) {
            System.out.print(integerList.get(i) + " ");
        }
        System.out.println();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        return Collections.min(array);
        // Найти минимум тут
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        Random rnd = new Random();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            result.add(rnd.nextInt(20));
        }
        return result;
    }
}