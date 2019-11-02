package com.javarush.task.task12.task1210;

/* 
Три метода и максимум
*/

public class Solution {
    public static void main(String[] args) {

    }
    //Напишите тут ваши методы
    public static int max(int a, int b){
        return a > b? a:b; // ословно. В случае, если выражение a < b истинно,
        // возвращает значение a, иначе возвращает значение b.
        // Это конструкция if-then-else. Встречается довольно таки часто, поэтому видать не там вы рыли)
    }
    public static long max(long a, long b){
        return a > b? a:b;
    }

    public static double max (double c, double r){
        return c > r? c:r;
    }

}


/*
public static int min(int i, int j){ return  i<j? i:j;}
public static long min(long il , long jl){ return  il<jl? il:jl;}
public static double min(double id, double jd){ return  id<jd? id:jd;}

аписать public static методы: int max(int, int), long max(long, long), double max(double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.


 */