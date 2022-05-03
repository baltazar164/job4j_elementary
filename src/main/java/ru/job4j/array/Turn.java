package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        float lastInd = array.length - 1;
        int border = Math.round(lastInd / 2) - 1;
        for (int i = 0; i <= border; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}