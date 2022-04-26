package ru.job4j.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathCalculatorTest {

    @Test
    public void whenThenDifferenceAndDivisionTake22Then1() {
        double expected = 1;
        double out = MathCalculator.differenceAndDivision(2, 2);
        double eps = 0.0001f;
        assertEquals(expected, out, eps);
    }

    @Test
    public void whenThenAllMethodsMathFunctionTake22Then9() {
        double expected = 9;
        double out = MathCalculator.allMethodsMathFunction(2, 2);
        double eps = 0.0001f;
        assertEquals(expected, out, eps);
    }

}