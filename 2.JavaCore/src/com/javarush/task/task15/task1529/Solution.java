package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    static {
        //add your code here - добавьте код тут
        try
        {
            Solution.reset();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static Flyable result;

    public static void reset() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String parameter;
        int passengers;
        parameter = reader.readLine();


        if (parameter.equals("helicopter"))
            result = new Helicopter();
        if (parameter.equals("plane")) {
            passengers = Integer.parseInt(reader.readLine());
            result = new Plane(passengers);
        }
        reader.close();
    }

}
    

