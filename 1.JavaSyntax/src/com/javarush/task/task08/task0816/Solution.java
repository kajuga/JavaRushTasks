package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        for (int i = 0; i++ < 10; map.put("lastname" + i, new Date("JUNE 1 1980"))) ;
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        HashMap<String, Date> mapCopy = new HashMap<>(map);
        for (HashMap.Entry<String, Date> pair : mapCopy.entrySet()) {
            if ((pair.getValue().getMonth() > 4) && (pair.getValue().getMonth() < 8))
                map.remove(pair.getKey());
        }
    }


    public static void main(String[] args) {

    }
}

