package com.javarush.task.task06.task0621;

import javafx.scene.shape.ClosePathBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Cat> family = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи деда: ");
        String grandFather = reader.readLine();
        Cat catGrandfather = new Cat(grandFather);
        System.out.println("Введи бабку: ");
        String grandMather = reader.readLine();
        Cat catGrandmather = new Cat(grandMather);
        System.out.println("Введи мамку: ");
        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandmather);
        System.out.println("Введи папку: ");
        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandfather);
        System.out.println("Введи дочку:");
        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);
        System.out.println("Введи сынка:");
        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);
        family.add(catGrandfather);
        family.add(catGrandmather);
        family.add(catMother);
        family.add(catFather);
        family.add(catSon);
        family.add(catDaughter);

        for (Cat cat : family
             ) {
            System.out.println(cat);
        }
    }


    public static class Cat {
        private String name;
        private Cat parentMale;
        private Cat parentFemale;


        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent) {
            this.name = name;
            this.parentMale = parent;
        }

        Cat (String name, Cat parentFemale, Cat parentMale) {
            this.name = name;
            this.parentFemale = parentFemale;
            this.parentMale = parentMale;
        }


        @Override
        public String toString() {
            if (parentMale == null) {
                return "The cat's name is " + name + ", no mother ";
            } else if (parentFemale == null) {
                return "The cat's name is " + name + ", no father ";
            } else if (parentMale == null && parentFemale == null) {
                return "The cat's name is " + name + ", no father, no mather ";
            } else {
                return "The cat's name is " + name + ", mother is " + parentMale.name + ", father is " + parentFemale;
            }
        }

    }
}
