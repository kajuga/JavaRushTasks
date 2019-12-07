package com.javarush.task.task16.task1632;

public class Thread4 extends Thread implements Message {
    @Override
    public void run() {

        while (!interrupted()) {

        }
    }

    @Override
    public void showWarning() {
        this.interrupt();
    }
}
