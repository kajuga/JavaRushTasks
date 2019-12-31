package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();    //считал  с консоли 2 имени файла, ок
        reader.close();

        BufferedReader inputFile1 = new BufferedReader(new FileReader(file1));  //считываем через BufferedReader содержимое этих двух файлов
        BufferedReader inputFile2 = new BufferedReader(new FileReader(file2));

        List<String> list1 = new ArrayList<>(); //объявляем и инициализируем 2 списка
        List<String> list2 = new ArrayList<>();

        while (inputFile1.ready()) {        //заполняем первый саисок
            list1.add(inputFile1.readLine());
        }

        while (inputFile2.ready()) {        //заполн7яем второй.
            list2.add(inputFile2.readLine());
        }

        inputFile1.close();             //закрываем чтение из файов, ок
        inputFile2.close();

        while (list1.size() > 0 | list2.size() > 0) {   // замутиваем циклик в котором при если что-то хотя бы в 1 из 2 списках есть, то
            if (list1.size() > 0 && list2.size() > 0) {             //тут условие подциклика что 2 непустые:

                if (list1.get(0).equals(list2.get(0))) {            //сравниваем первый элементы
                    lines.add(new LineItem(Type.SAME, list1.get(0)));   //если равны, то в наш самый главный список, что наверху добавляем новый элемент типа LineItem проинициализированный параментом SAME                   list1.remove(0);
                    list2.remove(0);                                  //... и зачемто удаляем этот элемент из списка №2, ну ладно...
                }
                else if (!list1.get(0).equals(list2.get(0)) && !list1.get(0).equals(list2.get(1))) {  //чтот я тут не понял форму записи.
                    lines.add(new LineItem(Type.REMOVED, list1.get(0)));
                    list1.remove(0);
                }
                else if (!list1.get(0).equals(list2.get(0)) && list1.get(0).equals(list2.get(1))) {
                    lines.add(new LineItem(Type.ADDED, list2.get(0)));
                    list2.remove(0);
                }
            }
            else if (list1.size() > 0 && list2.isEmpty()) { //тут сравниваются и чтот я непонимаю что нужно по условию от слова СОВСЕМ
                for (int i = 0; i < list1.size(); i++) {
                    lines.add(new LineItem(Type.REMOVED, list1.get(i)));
                    list1.remove(0);
                }
            } else if (list1.isEmpty() && list2.size() > 0) {
                for (int i = 0; i < list2.size(); i++) {
                    lines.add(new LineItem(Type.ADDED, list2.get(i)));
                    list2.remove(0);
                }
            }
        }

        for (int i = 0; i < lines.size(); i++) {
            System.out.println(lines.get(i));
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

        @Override
        public String toString() {
            return type + " " + line;
        }
    }
}
