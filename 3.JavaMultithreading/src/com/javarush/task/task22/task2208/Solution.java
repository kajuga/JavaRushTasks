package com.javarush.task.task22.task2208;

import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {

    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> map : params.entrySet()) {
            if (map.getValue() != null) {
                stringBuilder.append(String.format("%s = '%s'", map.getKey(), map.getValue())).append(" and");
            }

        }
        return stringBuilder.toString();
    }
}
