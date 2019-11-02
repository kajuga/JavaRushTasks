package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.List;

/* 
Список из массивов чисел
*/
public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        return new ArrayList<int[]>();
    }

    public static void printList(ArrayList<int[]> list) {
//        for (int[] array : list) {
//            for (int x : array) {
//                System.out.println(x);
//            }
//        }

    for (int[] xxx : list) {
        for (int inner : xxx) {
            System.out.println(inner);
        }
    }

    }
}
