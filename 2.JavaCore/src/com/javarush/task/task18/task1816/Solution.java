package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) {
        String alphabetL = "abcdefghijklmnopqrstuvwxyz";
        String alphabetH = alphabetL.toUpperCase();
        int count = 0;
        try(FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
            char temp = (char) fileReader.read();
            if (alphabetH.indexOf(temp) > -1 || alphabetL.indexOf(temp) > -1) {
                count++;
            }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }
}
