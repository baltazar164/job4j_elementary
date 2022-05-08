package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        boolean stopLoop = false;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                stopLoop = true;
                for (int i = index + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        array[index] = array[i];
                        array[i] = null;
                        stopLoop = false;
                        break;
                    }
                }
            }
            if (stopLoop) {
                break;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (String s : compressed) {
            System.out.print(s + " ");
        }
    }

}