package com.javarush.task.task14.task1417;

import com.javarush.task.task14.task1417.Money;



public class Hrivna extends Money{

    public Hrivna(double amount) {
        super(amount);
    }
    @Override
    public String getCurrencyName() {
        return "HRN";
    }

    @Override
    public double getAmount() {
        return 200.0;
    }
}
