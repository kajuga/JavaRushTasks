package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String name = bf.readLine();
        int e = Integer.parseInt(bf.readLine());
        int m = Integer.parseInt(bf.readLine());
        int d = Integer.parseInt(bf.readLine());
        System.out.println("Меня зовут " + name);
        System.out.println("Я родился " + d + "." + m + "." + e);
    }
}

/*
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.

Вывести на экран текст:
"Меня зовут name.
Я родился d.m.y"

Пример вывода:
Меня зовут Вася.
Я родился 15.2.1988
 */