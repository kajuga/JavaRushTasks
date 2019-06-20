package com.javarush.task.task06.task0614;

import java.util.ArrayList;
import java.util.List;

/* 
Статические коты
*/

public class Cat {
    //напишите тут ваш код
    static List<Cat> catList = new ArrayList<>();

    @Override
    public String toString() {
        return "Cat{}";
    }

    public Cat() {
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 10; i++) {
            catList.add(new Cat());
        }
        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
        for (int i = 0; i < 10; i++) {
            System.out.println(catList.get(i));
        }
    }
}
