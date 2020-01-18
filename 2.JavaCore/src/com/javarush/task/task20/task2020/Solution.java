package com.javarush.task.task20.task2020;

import java.io.*;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

/* 
Сериализация человека
*/
public class Solution {

    public static class Person implements Serializable {
        String firstName;
        String lastName;
        transient String fullName;
        final transient String greeting;
        String country;
        Sex sex;
       transient PrintStream outputStream;
        transient Logger logger;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greeting = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }

//        private Object readResolve() {
//            return new Person(this.firstName, this.lastName,
//                    this.country, this.sex);
//        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return firstName.equals(person.firstName) &&
                    lastName.equals(person.lastName) &&
                    country.equals(person.country) &&
                    sex == person.sex;
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstName, lastName, country, sex);
        }
    }

    enum Sex {
        MALE,
        FEMALE
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person pers1 = new Person("sashok","xxx","Russia", Sex.MALE);
        System.out.println(pers1);
        ByteArrayOutputStream bot = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bot);
        oos.writeObject(pers1);
        oos.close();
        ByteArrayInputStream bit = new ByteArrayInputStream(bot.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bit);
        Person pers2 = (Person)ois.readObject();
        ois.close();

        System.out.println(pers2.equals(pers1));


    }
}
