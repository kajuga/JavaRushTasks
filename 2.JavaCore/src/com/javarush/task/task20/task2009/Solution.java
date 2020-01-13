package com.javarush.task.task20.task2009;

import java.io.*;

/*
Как сериализовать static?
*/
public class Solution {
    public static class ClassWithStatic implements Serializable{
        public static String staticString = "11111";
        public int i;
        public int j;
        // Закомментируйте эти методы
        private void serializationStatic(ObjectOutputStream stream) throws IOException {
//            stream.defaultWriteObject();
            stream.writeObject(staticString);
        }
        private void deserializationStatic(ObjectInputStream stream) throws IOException, ClassNotFoundException {
//            stream.defaultReadObject();
            staticString = (String) stream.readObject();
        }
        // Закомментируйте эти методы
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File objectFile = File.createTempFile("objectWhithStaticFild",".bin", new File("/home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2009/"));
        //System.out.println(objectFile.getPath()); // путь к созданному временному файлу
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(objectFile));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(objectFile));

        ClassWithStatic first = new ClassWithStatic();
        first.staticString = "22222";
        first.serializationStatic(oos);
        oos.writeObject(first);
        oos.close();

        first.staticString = "33333";

        ClassWithStatic second = new ClassWithStatic();
//        System.out.println(second.staticString);
        second.deserializationStatic(ois);
//        second = (ClassWithStatic) ois.readObject();
        System.out.println(ClassWithStatic.staticString);
        // у Вас будут разные надписи(в зависимости от наличия/отсутствия методов)
        ois.close();
     }
}

//class A implements Serializable{
//    private static int n=0;
//    private int i;
//    A(int i){
//        this.i=i;
//        n=i;
//    }
//    public String toString(){
//        return i+" "+n;
//    }
//    public static void serializeStatic(ObjectOutputStream oos) throws IOException{
//        oos.writeInt(n);
//    }
//    public static void deserializeStatic(ObjectInputStream ois) throws IOException{
//        n=ois.readInt();
//    }
//}

//public class Temp{
//    public static void main(String []args) throws IOException,ClassNotFoundException {
//        A a = new A(5);
//        System.out.println(a);
//        String path = "serial.dat";
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
//        A.serializeStatic(oos);
//        oos.writeObject(a);
//        a = new A(10);
//        System.out.println(a);
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
//        A.deserializeStatic(ois);
//        a = (A)ois.readObject();
//        System.out.println(a);
//    }
//}