package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {

        for (int indOut = 0; indOut < height; indOut++) {
            for (int indIn = 0;  indIn < width; indIn++) {
                if ((indOut + indIn) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}