package com.javarush.task.task11.task1123;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Arrays.sort(data);
        System.out.println(data[0] +" " +  data[data.length - 1]);

    }


}
