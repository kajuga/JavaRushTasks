package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
   public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap();
        for (int i =0;i < 10;i++){
            map.put("Surename"+i, "Name");
        }

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
;
        int count = 0;
        for (String value: map.values()){
            if (value.equals(name)) count ++;
        }
        return count;


    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        

        int countt = 0;
        for (String key: map.keySet()){
            if (key.equals(lastName)) countt ++;
        }
        return countt;

    }

    public static void main(String[] args) {
       // System.out.println(getCountTheSameFirstName(createMap(), "Name"));
       // System.out.println(getCountTheSameLastName(createMap(), "Surename2"));

    }
}