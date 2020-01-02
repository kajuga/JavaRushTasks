package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream main = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream newStream = new PrintStream(byteArrayOutputStream);
        System.setOut(newStream);
        testString.printSomething();
        String contest = "JavaRush - курсы Java онлайн";
        String temp = byteArrayOutputStream.toString();
        System.setOut(main);

        int counter = 0;
        for (String s : temp.split("\n")) {
            System.out.println(s);
            counter++;
            if (counter % 2 == 0) {
                System.out.println(contest);
            }
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
