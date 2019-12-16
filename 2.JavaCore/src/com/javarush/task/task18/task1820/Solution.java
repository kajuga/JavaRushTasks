package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName1 = sc.nextLine();
        String fileName2 = sc.nextLine();
        sc.close();
        try {
            Scanner in = new Scanner(new FileInputStream(fileName1));
            in.useLocale(Locale.ENGLISH);
            List<Float> list = new ArrayList<Float>();
            while (in.hasNext()) {
                list.add(in.nextFloat());
            }
            in.close();
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));
            for (float number: list) {
                writer.write(Math.round(number) + " ");
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}