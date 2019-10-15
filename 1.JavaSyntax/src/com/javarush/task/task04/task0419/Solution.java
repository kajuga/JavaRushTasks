package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int tmp = sc.nextInt();
            if (tmp > result) {
                result = tmp;
            }
        }
            System.out.println(result);
        }
    }

