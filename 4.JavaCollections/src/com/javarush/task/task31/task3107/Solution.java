package com.javarush.task.task31.task3107;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
Null Object Pattern
*/
public class Solution {
    private FileData fileData;

    public Solution(String pathToFile) throws IOException {
        Path file = Paths.get(pathToFile);
        try {
            fileData = new ConcreteFileData(Files.isHidden(file), Files.isExecutable(file),  Files.isDirectory(file),  Files.isWritable(file));

          System.out.println(fileData.isHidden());
            System.out.println(fileData.isDirectory());
            System.out.println(fileData.isExecutable());
            System.out.println(fileData.isWritable());

        } catch (Exception e) {
            fileData = new NullFileData(e);
        }

    }

    public FileData getFileData() {
        return fileData;
    }

    public static void main(String[] args) throws IOException  {
        Solution solution = new Solution("/home/kajuga/projects/JavaRushTasks/4.JavaCollections/src/com/javarush/task/task31/task3107/sashok.txt");
        System.out.print("\n");
        Solution solution2 = new Solution("/home/kajuga/projects/JavaRushTasks/4.JavaCollections/src/com/javarush/task/task31/task3107");
    }
}