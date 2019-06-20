package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //напишите тут ваш код
        switch (month) {
            case 1: {
                System.out.println("Январь");
                break;
            }
            case 2: {
                System.out.println("Февраль");
                break;

            }
            case 3: {
                System.out.println("Март");
                break;
            }
            case 4: {
                System.out.println("Апрель");
                break;

            }
            case 5: {
                System.out.println("Май");
                break;
            }
            case 6: {
                System.out.println("Июнь");
                break;
            }
            case 7: {
                System.out.println("Июль");
                break;
            }
            case 8: {
                System.out.println("Август");
                break;
            }
            case 9: {
                System.out.println("Сентябрь");
                break;
            }
            case 10: {
                System.out.println("Октябрь");
                break;
            }
            case 11: {
                System.out.println("Ноябрь");
                break;
            }
            case 12: {
                System.out.println("Декабрь");
                break;
            }
        }
    }
}