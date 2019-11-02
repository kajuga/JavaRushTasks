package com.javarush.task.task12.task1233;

/* 
Изоморфы наступают
*/

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -18, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The index of the minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        Integer min = array[0];
        Integer m_index  = 0;
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }


        for (int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
                m_index = i;
            }
        }

        //напишите тут ваш код

        return new Pair<Integer, Integer>(min, m_index);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
