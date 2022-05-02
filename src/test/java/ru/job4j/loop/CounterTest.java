package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSum0To10Then55() {
        int expected = 55;
        int actual = Counter.sum(0, 10);
        assertEquals(expected, actual);
    }

    @Test
    public void whenSum3To8Then33() {
        int expected = 33;
        int actual = Counter.sum(3, 8);
        assertEquals(expected, actual);
    }

    @Test
    public void whenSum1To1Then1() {
        int expected = 1;
        int actual = Counter.sum(1, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void whenSumM3To5Then9() {
        int expected = 9;
        int actual = Counter.sum(-3, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void whenSumByEven0To10Then30() {
        int expected = 30;
        int actual = Counter.sumByEven(0, 10);
        assertEquals(expected, actual);
    }

    @Test
    public void whenSumByEven3To8Then18() {
        int expected = 18;
        int actual = Counter.sumByEven(3, 8);
        assertEquals(expected, actual);
    }

    @Test
    public void whenSum1To1Then0() {
        int expected = 0;
        int actual = Counter.sumByEven(1, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void whenSumM3To5Then4() {
        int expected = 4;
        int actual = Counter.sumByEven(-3, 5);
        assertEquals(expected, actual);
    }
}