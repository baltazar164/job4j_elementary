package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int ind = 1; ind <= n; ind++) {
            result = result * ind;
        }
        return result;
    }
}