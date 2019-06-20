package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
int sumOfInhabitantsEven = 0;
int sumOfInhabitantsOdd = 0;

BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

int[] numOfInhabitants = new int[15];

for (int i = 0; i < numOfInhabitants.length; i++) {
    numOfInhabitants[i] = Integer.parseInt(bufferedReader.readLine());
}

for (int i = 0; i < numOfInhabitants.length; i++) {

    if (i % 2 == 0) {
        sumOfInhabitantsEven += numOfInhabitants[i];
    } else  {
        sumOfInhabitantsOdd += numOfInhabitants[i];
    }

}

if (sumOfInhabitantsEven > sumOfInhabitantsOdd) {
    System.out.println("В домах с четными номерами проживает больше жителей.");
} else if (sumOfInhabitantsEven < sumOfInhabitantsOdd) {
    System.out.println("В домах с нечетными номерами проживает больше жителей.");
}
}
}