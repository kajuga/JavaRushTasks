package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t1.printResult();
        t2.printResult();
    }

    public static class Read3Strings extends Thread {
        private String[] str = new String[3];

        @Override
        public void run() {
            try {
                for (int i = 0; i < str.length; i++) {
                    str[i] = reader.readLine();
                }
            } catch (IOException e) {
            }
        }

        public void printResult() {
            for (int i = 0; i < str.length; i++) {
                System.out.print(str[i] + " ");
            }
        }
    }
}
