package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    static Hippodrome game;
    private List<Horse> horses = new ArrayList<>();

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }

    }
    void print() {
        for (Horse horse: horses) {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n");
        }
    }

    void move() {
        for (Horse horce: horses) {
            horce.move();
        }
    }

    public Horse getWinner() {
        double tempDistance = 0;
        int marker = 0;
        for (int i = 0; i < horses.size(); i++) {
            if (horses.get(i).getDistance() > tempDistance) {
                tempDistance = horses.get(i).getDistance();
                marker = i;
            }
        }
        return horses.get(marker);
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");

    }

    public static void main(String[] args) throws InterruptedException {
        Horse horse1 = new Horse("Horse1", 3, 0);
        Horse horse2 = new Horse("Horse2", 3, 0);
        Horse horse3 = new Horse("Horse3", 3, 0);
        List<Horse> horseList = new ArrayList<>();
        horseList.add(horse1);
        horseList.add(horse2);
        horseList.add(horse3);
        game = new Hippodrome(horseList);
        game.run();
        game.printWinner();
    }
}
