package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, pref);
        Assert.assertFalse(result);
    }

    @Test
    public void whenPrefixLengthGreater() {
        char[] word = {'H', 'e', 'l'};
        char[] pref = {'H', 'e', 'l', 'l', 'o'};
        boolean result = ArrayChar.startsWith(word, pref);
        Assert.assertFalse(result);
    }
}