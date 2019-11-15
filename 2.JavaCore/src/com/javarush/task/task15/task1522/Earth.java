package com.javarush.task.task15.task1522;

public class Earth implements Planet {
    private static Earth instance;

    private Earth() {
    }

    public static Earth getInstance() {
        return (instance == null) ? instance = new Earth() : instance;
    }
}
