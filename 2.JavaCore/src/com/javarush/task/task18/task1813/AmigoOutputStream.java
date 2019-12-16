package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "/home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1813/result.txt";
    private FileOutputStream original;

    public AmigoOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException  {
        super(fileName);
        this.original = fileOutputStream;
    }

    public void flush() throws IOException{original.flush();}
    public void write(int b) throws IOException{original.write(b);}
    public void write(byte[] b) throws IOException{original.write(b);}
    public void write(byte[] b, int off, int len) throws IOException{original.write(b,off,len);}

    @Override
    public void close() throws IOException {
        flush();
        this.write("JavaRush © All rights reserved.".getBytes());
        original.close();
    }



    public static void main(String[] args) throws IOException {
        new AmigoOutputStream(new FileOutputStream(fileName)).close();
    }

}