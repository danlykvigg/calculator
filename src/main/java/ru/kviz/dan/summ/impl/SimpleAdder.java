package ru.kviz.dan.summ.impl;

import ru.kviz.dan.summ.Adder;

public class SimpleAdder implements Adder {

    @Override
    public double sumTwoElement(double x, double y) {
       return  x + y;
    }
}
