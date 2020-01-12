package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
/home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2003/.propertya
/home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2003/.propertya2
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() {
        //implement this method - реализуйте этот метод
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
            FileOutputStream fileOutputStream = new FileOutputStream(bufferedReader.readLine())) {
            load(fileInputStream);
            save(fileOutputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties propSave = new Properties();
        propSave.putAll(properties);
        propSave.store(outputStream, "");

    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties propLoad = new Properties();
        propLoad.load(inputStream);
        for (Map.Entry<Object, Object> entry: propLoad.entrySet()) {
            properties.put((String) entry.getKey(), (String)entry.getValue());
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.fillInPropertiesMap();
        System.out.println(properties);
    }
}
