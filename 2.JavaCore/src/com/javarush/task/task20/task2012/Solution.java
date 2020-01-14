package com.javarush.task.task20.task2012;

import java.io.*;

/* 
OutputToConsole
*/
public class Solution {
    public static String greeting = "Hello world";

    /**
     * OutputToConsole is an inner base class for improving your attentiveness.
     * An OutputToConsole object encapsulates the information needed
     * for displaying the [greeting] variable to the console.
     * @author JavaRush
     */
    public static class OutputToConsole implements Externalizable {
        private int counter;

        /**
         * @param out A stream for externalization
         * @throws java.io.IOException
         */
        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeInt(this.counter);
        }

        /**
         * @param in A stream for de-externalization
         * @throws java.io.IOException
         * @throws ClassNotFoundException
         */
        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            this.counter = in.readInt();
        }

        /**
         * Class constructor that sets the private counter field.
         */
        public OutputToConsole(int counter) {
            this.counter = counter;
        }

        public OutputToConsole() {
        }

        /**
         * Prints greeting message to console counter times.
         */
        public void printMessage() {
            for (int i = 0; i < counter; i++) {
                System.out.println(greeting);
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = File.createTempFile("sashok", ".dat", new File("/home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2012/"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        OutputToConsole outputToConsole = new OutputToConsole(666);
        oos.writeObject(outputToConsole);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        OutputToConsole outputToConsole1 = (OutputToConsole)ois.readObject();
        ois.close();
        System.out.println(outputToConsole1.counter);
    }
}
