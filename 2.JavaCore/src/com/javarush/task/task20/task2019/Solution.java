package com.javarush.task.task20.task2019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Исправить ошибку. Сериализация
*/
public class Solution implements Serializable {

    public static void main(String args[]) throws Exception {
        File file = File.createTempFile("sashok", ".dat", new File("/home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2019/"));
        FileOutputStream fileOutput = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fileOutput);

        Solution solution = new Solution();
        oos.writeObject(solution);

        //fileOutput.close();
        oos.close();

        //loading
//        FileInputStream fiStream = new FileInputStream("your.file.name");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        Solution loadedObject = (Solution) ois.readObject();

        ois.close();
        file.delete();

        //Attention!!
        System.out.println(loadedObject.size());
    }

    private Map<String, String> m = new HashMap<>();

    public Map<String, String> getMap() {
        return m;
    }

    public  Solution() {
        m.put("Mickey", "Mouse");
        m.put("Mickey2", "Mantle");
    }

    public int size() {
        return m.size();
    }
}