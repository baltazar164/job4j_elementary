package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        money = money - price;
        for (int i = 0; i < 4; i++) {
            while (money >= coins[i]) {
                money = money - coins[i];
                rsl[size++] = coins[i];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}