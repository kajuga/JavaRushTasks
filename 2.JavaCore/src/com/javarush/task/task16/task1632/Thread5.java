package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Thread5 extends Thread {
    private int counter;

    @Override
    public void run() {
        while (true) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                String temp = reader.readLine();
                while (!reader.readLine().equals("N")) {
                if(isNumber(temp)) {
                    counter += Integer.parseInt(temp);
                    }
            }
                System.out.println(counter);

            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }
}