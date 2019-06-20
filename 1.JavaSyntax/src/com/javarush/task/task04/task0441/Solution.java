package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a =12, b = 15, c = 6;
        System.out.println(averagetor(a, b, c));
    }

    static  int averagetor (int a, int b, int c) {
        return ((a <= b ? a : b) >= c ? (a <= b ? a : b) : c);
    }
}


/*
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.
 */