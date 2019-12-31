package com.javarush.task.task19.task1915;

/* 
Дублируем текст
/home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1915/text.txt
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();
        PrintStream base = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();
        System.setOut(base);

        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        byteArrayOutputStream.writeTo(fileOutputStream);
        System.out.println(byteArrayOutputStream.toString());



    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

