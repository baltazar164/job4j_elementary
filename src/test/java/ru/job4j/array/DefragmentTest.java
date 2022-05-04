package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class DefragmentTest {
    @Test
    public void singleFirstNull() {
        String[] input = {null, "I"};
        String[] result = Defragment.compress(input);
        String[] expected = {"I", null};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void notFirstNull() {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] result = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void firstNull() {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] result = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void notAllNull() {
        String[] input = {null, null, null};
        String[] result = Defragment.compress(input);
        String[] expected = {null, null, null};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void notAllAtFirstNull() {
        String[] input = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] result = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void speedTest() {
        int size = 100000;

        String[] input = new String[size];
        int num = 1;
        for (int i = 0; i < input.length; i++) {
            if (i % 2 == 0) {
                input[i] = Integer.toString(num);
                num++;
            }
        }

        String[] result = Defragment.compress(input);

        String[] expected = new String[size];
        for (int i = 0; i < (expected.length / 2); i++) {
            expected[i] = Integer.toString(i + 1);
        }

        Assert.assertArrayEquals(expected, result);
    }

}