package com.javarush.task.task20.task2011;

import java.io.*;

/*
Externalizable для апартаментов
*/
public class Solution {

    public static class Apartment implements Externalizable {

        private String address;
        private int year;

        /**
         * Mandatory public no-arg constructor.
         */
        public Apartment() {
            super();
        }

        public Apartment(String addr, int y) {
            address = addr;
            year = y;
        }

        @Override
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeObject(this.address);
            objectOutput.writeInt(this.year);

        }

        @Override
        public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
            this.address = (String) objectInput.readObject();
            this.year = objectInput.readInt();
        }

        /**
         * Prints out the fields used for testing!
         */
        public String toString() {
            return ("Address: " + address + "\n" + "Year: " + year);
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = File.createTempFile("sashok", ".dat", new File("/home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2011/"));
        Apartment apartment = new Apartment("Ленинград, Королева проспект", 2020);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(apartment);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Apartment apartment1 = (Apartment) ois.readObject();
        System.out.println(apartment1.toString());
        ois.close();
    }
}