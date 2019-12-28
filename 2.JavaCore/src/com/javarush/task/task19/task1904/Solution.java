package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {
    }

    public static class PersonScannerAdapter implements PersonScanner {
        Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            Person person = null;
            if (fileScanner.hasNextLine()) {
                String s = fileScanner.nextLine();
                String[] parts = s.split(" ");
                String firstName = parts[1];
                String middleName = parts[2];
                String lastName = parts[0];
                Calendar calendar = new GregorianCalendar(Integer.parseInt(parts[5]), Integer.parseInt(parts[4]), Integer.parseInt(parts[3]));
                person = new Person(lastName, middleName, firstName, calendar);
            }
            return person;
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
