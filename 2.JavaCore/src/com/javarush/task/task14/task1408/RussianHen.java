package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {
    public int getCountOfEggsPerMonth() {
        return 115;
    }

    String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }



}









/*
Описание курицы UkrainianHen должно соответствовать формату
"getDescription() родительского класса + Моя страна - Ukraine. Я несу N яиц в месяц.",
где N - число яиц в месяц(возвращаемое методом getCountOfEggsPerMonth.
Например: Я - курица. Моя страна - Ukraine. Я несу 5 яиц в месяц.
 */

