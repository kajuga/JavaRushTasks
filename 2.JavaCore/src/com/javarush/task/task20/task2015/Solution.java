package com.javarush.task.task20.task2015;

import java.io.*;

/*
Переопределение сериализации
*/
public class Solution implements Serializable, Runnable {
    transient private Thread runner;
    private int speed;

    public Solution(int speed) {
        this.speed = speed;
        runner = new Thread(this);
        runner.start();
    }

    public void run() {
        // do something here, does not matter
        System.out.println("123");

    }

    /**
     Переопределяем сериализацию.
     Для этого необходимо объявить методы:
     private void writeObject(ObjectOutputStream out) throws IOException
     private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
     Теперь сериализация/десериализация пойдет по нашему сценарию :)
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        Thread thread = new Thread(this);
        thread.start();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = File.createTempFile("sashok", ".dat", new File("/home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2015/"));
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Solution solution1 = new Solution(10);
            oos.writeObject(solution1);
            Solution solution2 = (Solution)ois.readObject();
            System.out.println(solution1.speed);
            System.out.println(solution2.speed);
            file.delete();
        }
    }
}