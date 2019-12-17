package com.javarush.task.task18.task1825;

import java.io.*;
import java.nio.channels.FileChannel;
import java.util.*;

/* 
Собираем файл
/home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1825/Lion.avi
/home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1825/Lion.avi.part1
/home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1825/Lion.avi.part2
/home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1825/Lion.avi.part3
/home/kajuga/projects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1825/Lion.avi.part4
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader    reader = new BufferedReader (new InputStreamReader (System.in));
        String            name;
        ArrayList<String> list   = new ArrayList<> ( );
        while (!(name = reader.readLine ( )).contains ("end"))
        {
            list.add (name);
        }
        Collections.sort (list);
        String nameNewFile = list.get (0);
        int pos=nameNewFile.lastIndexOf (".");
        nameNewFile = nameNewFile.substring (0, pos);
        FileOutputStream outputStream = new FileOutputStream (nameNewFile);
        byte[] buffer=new byte[1024];
        for (String nameFilePart : list)
        {
            FileInputStream inputStream = new FileInputStream (nameFilePart);
            while (inputStream.available ( ) > 0)
            {   int    count  = inputStream.read (buffer);
                outputStream.write (buffer, 0, count);
            }
            inputStream.close ( );
        }
        outputStream.close ();
        reader.close ( );
    }
}