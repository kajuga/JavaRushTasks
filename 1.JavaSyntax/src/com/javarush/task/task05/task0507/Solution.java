package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int temp = 0;
        int count = 0;
        float result = 0;
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            temp = Integer.parseInt(br.readLine());
            if (temp == -1) {
                break;
            }
            result += temp;
            count++;

        }
        System.out.println(result / count);
    }
}

