package others;

public class Array {
    public static int[] removeInd(int[] array, int ind) {
        int[] copy = new int[array.length - 1];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != ind) {
                copy[j++] = array[i];
            }

        }

        return copy;
    }
}
