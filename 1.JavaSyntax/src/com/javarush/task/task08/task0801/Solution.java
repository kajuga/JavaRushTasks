package com.javarush.task.task08.task0801;

/* 
Set из растений
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Set<String> grows = new HashSet<>();
        grows.add("арбуз");
        grows.add("банан");
        grows.add("вишня");
        grows.add("груша");
        grows.add("дыня");
        grows.add("ежевика");
        grows.add("женьшень");
        grows.add("земляника");
        grows.add("ирис");
        grows.add("картофель");


        for (String str: grows) {
            System.out.println(str);
        }

    }
}
