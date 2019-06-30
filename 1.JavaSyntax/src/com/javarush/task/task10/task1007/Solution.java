package com.javarush.task.task10.task1007;

/* 
Задача №7 на преобразование целых типов
*/

public class Solution {
      public static void main(String[] args) {
            long l = 111_1111_111_110L;
            int x =  0b1000_1100_1010;
            double m =  110_987_654_6299.123_34;
            float f =  l++ + 10 + ++x - (float) m;
            l = (long) f / 1000;
            System.out.println(l);
        }
    }
    
/*
Задача №7 на преобразование целых типов

Убери ненужные операторы приведения типа, чтобы получился ответ: 1234567
long l = (byte)111_1111_111_110L;
int x = (byte)0b1000_1100_1010;
double m = (byte)110_987_654_6299.123_34;
float f = (byte)l++ + 10 + ++x — (float)m;
l = (long) f / 1000;

Требования:
1. Программа должна выводить текст на экран.
2. Нельзя менять команду вывода на экран.
3. Метод main() должен содержать переменную l типа long.
4. Метод main() должен содержать переменную x типа int.
5. Метод main() должен содержать переменную m типа double.
6. Метод main() должен содержать переменную f типа float.
7. Начальное значение переменных при инициализации менять нельзя. Можно добавлять только операторы приведения типа.
8. Программа должна выводить текст 1234567.
*/