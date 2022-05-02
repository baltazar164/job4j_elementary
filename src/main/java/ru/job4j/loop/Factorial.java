package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int ind = 2; ind <= n; ind++) {
            result = result * ind;
        }
        return result;
    }
}