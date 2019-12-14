package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputStream = new FileInputStream(reader.readLine())) {
            while (true) {
                if (fileInputStream.available() < 1000) {
                    throw new DownloadException();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DownloadException e) {
            e.printStackTrace();
        }
    }

    public static class DownloadException extends Exception {
    }
}
