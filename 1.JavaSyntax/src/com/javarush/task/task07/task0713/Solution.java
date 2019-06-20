package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> main = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            main.add(Integer.parseInt(reader.readLine()));
            //main.add(i + 1);
        }
        for (int i = 0, curNum; i < main.size(); i++) {
            curNum = main.get(i);
            /*if (curNum == 0) {
                arr.add(curNum);
            } else */if (curNum % 3 == 0 && curNum % 2 == 0) {
                arr3.add(curNum);
                arr2.add(curNum);
            } else if (curNum % 3 == 0) {
                arr3.add(curNum);
            } else if (curNum % 2 == 0) {
                arr2.add(curNum);
            } else {
                arr.add(curNum);
            }
        }

        printList(arr3);
        printList(arr2);
        printList(arr);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}