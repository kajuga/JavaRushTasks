package com.javarush.task.task15.task1524;

public class Solution {

    public static void init() {                      //1
        System.out.println("Static block");
    }

    static {                                           //2
        System.out.println("static void init()");
    }



    public static void main(String[] args) {            //3
        System.out.println("public static void main");
        Solution s = new Solution();
    }


    {
        System.out.println("non-static block");     //4
        printAllFields(this);
    }

    public static void printAllFields(Solution obj) {       //5
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);
    }


    public Solution() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";
    static {
        init();
    }


}
