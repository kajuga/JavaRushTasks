package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> list = Arrays.asList(2, 4, 4, 4, 8, 8, 8, 8, 8, 4, 12, 12, 12, 12, 12, 12, 12, 14);
        int temp = 0;
        int temp2 = 0;
        Collections.sort(list);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == list.get(i - 1)) {
                temp++;
                continue;
            }
            if (temp2 < temp) {
                temp2 = temp;
                temp = 0;
            }
        }
        System.out.println(temp2 + 1);
    }
}
