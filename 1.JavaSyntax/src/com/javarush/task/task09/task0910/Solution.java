package com.javarush.task.task09.task0910;

import java.util.ArrayList;

/*
Исключение при работе с коллекциями List
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            method();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException caught");
        }
    }

    public static void method() {
        ArrayList<String> list = new ArrayList<String>();
        String s = list.get(18);
    }
}