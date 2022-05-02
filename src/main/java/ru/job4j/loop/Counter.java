package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int ind = start; ind <= finish; ind++) {
            sum = sum + ind;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int ind = start; ind <= finish; ind++) {
            if (ind % 2 == 0) {
                sum = sum + ind;
            }
        }
        return sum;
    }
}