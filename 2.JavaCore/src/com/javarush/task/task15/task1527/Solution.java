package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Парсер реквестов
*/
public class Solution {
    public static void main(String[] args) throws IOException{
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();// считываем строку
        int pos =  s.indexOf("?"); // порядковый номер "?" в строке
        String s1 = s.substring(pos+1, s.length()); // обрезаем лишнее перед "?"
        String[] strArray = s1.split("&"); // получаем массив строк - параметров
        for (String s2 : strArray) {// перебор массива
            if(s2.contains("=")){// если в строке - параметре есть "="
                pos = s2.indexOf("="); // получаем порядковый номер "?" в строке
                s1 = s2.substring(0, pos);//  обрезаем лишнее после "="
                System.out.println(s1); //выводим на печать (метод alert необходимо вызывать ПОСЛЕ вывода списка всех параметров на экран.)
            }
            else  System.out.println(s2); // иначе, если строка без "=", выводим на печать
        }
        for(String s2 : strArray){// повторный перебор массива
            if(s2.contains("obj")){ // если в строке - параметре есть "obj"
                s1 = s2.substring(pos); // обрезаем все до "=", включая "="
                try{
                    alert(Double.parseDouble(s1));//пытаемся привести строку в Double, если получается, вызывается метод alert(double value)
                }
                catch (NumberFormatException e) {// если строка не приводится к Double, ловим ошибку и вызываем alert(String value)
                    alert(s1);
                }

            }

        }

    }
    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
