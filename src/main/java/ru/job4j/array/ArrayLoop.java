package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] results = new int[5];
        for (int i = 0; i < results.length; i++) {
            results[i] = i * 2 + 3;
        }
        for (int i : results) {
            System.out.println(i);
        }
    }
}
