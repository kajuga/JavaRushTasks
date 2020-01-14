package com.javarush.task.task20.task2010;

import java.io.*;

/*
Как сериализовать что-то свое?
*/
public class Solution {
    public static int stringCount;

    public static class Object implements Serializable {
        public String string1;
        public String string2;
    }

    public static class String implements Serializable{
        private final int number;

        public String() {
            number = ++stringCount;
        }

        public void print() {
            System.out.println("string #" + number);
        }
    }

    public static void main(String[] args) throws IOException {
        File objectFile = File.createTempFile("sashok",".bin", new File("/home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2010/"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(objectFile));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(objectFile));








    }
}
