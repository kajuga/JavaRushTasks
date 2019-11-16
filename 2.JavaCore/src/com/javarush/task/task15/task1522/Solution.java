package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
    }

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static Planet thePlanet;

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        if (s.equals(Planet.EARTH)) {
            thePlanet = Earth.getInstance();
        }
        if (s.equals(Planet.SUN)) {
            thePlanet = Sun.getInstance();
        }
        if (s.equals(Planet.MOON)) {
            thePlanet = Moon.getInstance();
        } else {
            thePlanet = null;
        }
    }
}
