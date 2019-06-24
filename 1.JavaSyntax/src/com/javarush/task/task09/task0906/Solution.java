package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name1 = stackTraceElements[2].getClassName();
        String name2 = stackTraceElements[2].getMethodName();
        int line = stackTraceElements[2].getLineNumber();
        System.out.println("ClassName: " + name1 + " " + "::: MethodName: " + name2 + " " + "::: on line: " + line);
        //напишите тут ваш код
    }
}
