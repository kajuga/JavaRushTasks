package com.javarush.task.task22.task2205;

/* 
МНЕ нравится курс JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(String.format(getFormattedString(), "JavaRush", "курс", "мне", "нравится"));
        //должен быть вывод
        //"МНЕ нравится курс JavaRush"
    }
    public static String getFormattedString() {
        return "%3$2S %4$2S %2$2s %1$2s";
    }
}


//% = активируем режим
//        3 = позиция аргумента в строке которую хотим на выходе использовать
//        $ = даем это понять что именно позицию берем
//        S/s = в рассматриваемом случае - верхний/нижний строковый
