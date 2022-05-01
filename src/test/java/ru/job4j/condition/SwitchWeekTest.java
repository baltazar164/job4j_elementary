package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void when3ThenSreda() {
        String expected = "Среда";
        int in = 3;
        String out = SwitchWeek.nameOfDay(in);
        assertEquals(expected, out);
    }

    @Test
    public void when9ThenMistake() {
        String expected = "Ошибка";
        int in = 9;
        String out = SwitchWeek.nameOfDay(in);
        assertEquals(expected, out);
    }

}