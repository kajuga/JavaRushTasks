package com.javarush.task.task20.task2021;

import java.io.*;

/* 
Сериализация под запретом
*/
public class Solution implements Serializable {
    public static class SubSolution extends Solution {

        private void writeObject(ObjectOutputStream out) throws IOException {
            throw new NotSerializableException();
        }

        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            throw new NotSerializableException();
        }
    }

    public static void main(String[] args) throws IOException {

        SubSolution subSolution = new SubSolution();
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream outputStream = new ObjectOutputStream(bao);
        outputStream.writeObject(subSolution);
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
    }
}