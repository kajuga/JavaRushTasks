package com.javarush.task.task20.task2013;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Externalizable Person
*/
public class Solution {
    public static class Person implements Externalizable {
        private String firstName;
        private String lastName;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> children;

        public Person() {
        }

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public void setMother(Person mother) {
            this.mother = mother;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(firstName);
            out.writeObject(lastName);
            out.writeInt(age);
            out.writeObject(mother);
            out.writeObject(father);
            out.writeObject(children);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            firstName = (String)in.readObject();
            lastName = (String)in.readObject();
            age = in.readInt();
            mother = (Person)in.readObject();
            father = (Person)in.readObject();
            children = (List)in.readObject();
        }

        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    ", mother=" + mother +
                    ", father=" + father +
                    ", children=" + children +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = File.createTempFile("sashok", ".dat", new File("/home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2013/"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        Person person = new Person("Sashok", "Fedorov", 40);
        person.setMother(new Person("Nina", "Fedorova", 60));
        person.setFather(new Person("Alex", "Fedorov", 66));
        Person son = new Person("Zz", "Fedorov", 9);
        Person son2 = new Person("Xx", "Fedorov", 12);
        Person daughter = new Person("Oo", "Fedorova", 5);
        List<Person> chads = new ArrayList<>();
        chads.add(son);
        chads.add(son2);
        chads.add(daughter);
        person.setChildren(chads);
        oos.writeObject(person);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Person loadedPerson = (Person) ois.readObject();
        System.out.println(loadedPerson);
    }
}