package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<Integer> list = new ArrayList<>();
            list.add(Integer.parseInt(reader.readLine()));
            int max = 1, tmp_max = 1;
            for (int i = 1; i < 10; i++) {
                list.add(Integer.parseInt(reader.readLine()));
                if (list.get(i).equals(list.get(i - 1))) tmp_max++;
                else {
                    if (tmp_max > max) max = tmp_max;
                    tmp_max = 1;
                }
            }
            System.out.println(max > tmp_max ? max : tmp_max);
        }
    }