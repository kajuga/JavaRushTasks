package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();
    static String fileOneName;
    static String fileTwoName;

    public static void main(String[] args) {

        try (BufferedReader fileNamesReader = new BufferedReader(new InputStreamReader(System.in))) {
            while (fileNamesReader.ready()) {
                fileOneName = fileNamesReader.readLine();
                fileTwoName = fileNamesReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileOneName))) {
            while (fileReader.ready()) {
                allLines.add(fileReader.readLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader fileReader2 = new BufferedReader(new FileReader(fileOneName))) {
            while (fileReader2.ready()) {
                forRemoveLines.add(fileReader2.readLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else allLines.clear();
        throw new CorruptedDataException();
    }
}