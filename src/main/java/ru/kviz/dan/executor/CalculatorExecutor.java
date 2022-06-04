package ru.kviz.dan.executor;

import ru.kviz.dan.subtraction.SimpleSubtraction;
import ru.kviz.dan.subtraction.Subtraction;
import ru.kviz.dan.summ.Adder;
import ru.kviz.dan.summ.impl.SimpleAdder;

public class CalculatorExecutor {
    public static void main(String[] args) {
        Adder simpleAdder = new SimpleAdder();
        double resultSum = simpleAdder.sumTwoElement(0, 0);
        System.out.println(resultSum);

        Subtraction subtraction = new SimpleSubtraction();
        double resultSub = subtraction.subtractionTwoElement(27, 45);
        System.out.println(resultSub);
    }
}
