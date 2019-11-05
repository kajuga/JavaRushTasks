package com.javarush.task.task14.task1417;

import com.javarush.task.task14.task1417.Money;

    public class Ruble extends Money{
        public Ruble(double amount) {
            super(amount);
        }
    @Override
    public String getCurrencyName() {
            return "RUB";
        }

        @Override
        public double getAmount() {
            return 800.0;
        }
    }