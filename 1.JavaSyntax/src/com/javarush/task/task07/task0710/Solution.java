package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Stack stack = new Stack();
        for (int i = 0; i < 10; i++) {
            stack.push(reader.readLine());
        }

       while (!stack.empty()) {
           System.out.println(stack.pop());
       }
    }
}
