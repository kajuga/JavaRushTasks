package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        System.out.println(name);
        return name;
    }

    public static String method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        System.out.println(name);
        return name;
        //напишите тут ваш код
    }

    public static String method3() {
        method4();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        System.out.println(name);
        return name;
    }

    public static String method4() {
        method6();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        System.out.println(name);
        return name;
    }

    public static String method5() {
        //напишите тут ваш код
        method6();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        System.out.println(name);
        return name;
    }

    public static int method6() {
        StackTraceElement [] stackTraceElements = Thread.currentThread().getStackTrace();
        int name = stackTraceElements[2].getLineNumber();
        System.out.println(name);
        return name;

    }


}