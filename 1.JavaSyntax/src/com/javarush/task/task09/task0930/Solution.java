package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Set<String> stringList = new TreeSet<>();
        List<Integer> integerList = new ArrayList<>();


        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (reader != null) {
                String temp = reader.readLine();
                if (isNumber(temp) ? integerList.add(Integer.parseInt(temp)) : stringList.add(temp)) ;
            }
        }
        for (String str : stringList) {
            System.out.println(str);
        }

        System.out.println(Collections.reverseOrder());

    }

    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    Comparator<Integer> comparator = new Comparator<Integer>() {

        public int compare(Integer o1, Integer o2) {
            if (o1 > o2) {
                return -1;
            }
            if (o1 < o2) {
                return 1;
            }
            return 0;
        }

    };
}
