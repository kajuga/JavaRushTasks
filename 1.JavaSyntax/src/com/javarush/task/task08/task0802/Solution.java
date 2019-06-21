package com.javarush.task.task08.task0802;

/* 
Map из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Map<String, String> fruitz = new HashMap<>();
        fruitz.put("арбуз", "ягода");
        fruitz.put("банан", "трава");
        fruitz.put("вишня", "ягода");
        fruitz.put("дыня", "ягода");
        fruitz.put("ежевика", "ягода");
        fruitz.put("жень-шень", "корень");

        for (HashMap.Entry<String, String> pair : fruitz.entrySet()) {
            System.out.println(pair.getKey() + "-" + pair.getValue());
        }
    }
}
