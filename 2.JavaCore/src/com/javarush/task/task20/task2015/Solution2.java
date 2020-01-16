package com.javarush.task.task20.task2015;

import java.io.*;

public class Solution2 implements Externalizable, Runnable {
    private Thread runner;
    private int speed;

    public Solution2() {
    }

    public Solution2(int speed) {
        this.speed = speed;
        runner = new Thread(this);
        runner.start();
    }

    public Solution2(int speed, Thread thread) {
        this.speed = speed;
        this.runner = thread;
        runner.run();
    }

    @Override
    public void run() {
        System.out.println("run method");
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("writeExternal");
        out.writeInt(speed);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("readExternal");
        speed = in.readInt();
        runner = new Thread(this);
        runner.run();
    }

    /**
     * Переопределяем сериализацию.
     * Для этого необходимо объявить методы:
     * private void writeObject(ObjectOutputStream out) throws IOException
     * private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
     * Теперь сериализация/десериализация пойдет по нашему сценарию :)
     */

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Solution2 save = new Solution2(5);
        Solution2 load;
        File file = File.createTempFile("sashok2", ".dat", new File("/home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2015/"));
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        out.writeObject(save);
        load = (Solution2) in.readObject();
    }
}