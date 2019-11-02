package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/* 
Метод в try..catch
*/

public class Solution {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                stack.push(Integer.parseInt(reader.readLine()));
            }

        } catch (Exception e) {
            for (Integer inputed : stack) {
                System.out.println(inputed);

            }
        }




    }



}