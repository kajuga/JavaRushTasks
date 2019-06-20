package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        boolean resutl = true;
        if (this.strength >= anotherCat.strength & this.weight > anotherCat.weight) {
            return resutl;
        } else  {
            resutl = false;
        }
        return resutl;
    }


    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.weight = 5;
        cat1.strength = 10;
        cat1.age = 3;
        Cat cat2 = new Cat();
        cat2.weight = 4;
        cat2.strength = 8;
        cat2.age = 14;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));

    }
}
