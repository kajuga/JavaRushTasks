package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] mix;
        StringBuilder strVowels = new StringBuilder();
        StringBuilder strOthers = new StringBuilder();
        mix = reader.readLine().toCharArray();
        for (int i = 0; i < mix.length; i++) {
            if (mix[i] != 0 && isVowel(mix[i])) {
                strVowels.append(mix[i] + " ");
            } else {
                if (mix[i] != ' ')
                    strOthers.append(mix[i] + " ");
            }
        }

        System.out.print(strVowels);
        System.out.println();
        System.out.print(strOthers);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}