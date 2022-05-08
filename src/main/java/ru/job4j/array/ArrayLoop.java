package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] fancs = new int[5];
        for (int i = 0; i < fancs.length; i++) {
            fancs[i] = i * 2 + 3;
        }
        for (int i : fancs) {
            System.out.println(i);
        }
    }
}
