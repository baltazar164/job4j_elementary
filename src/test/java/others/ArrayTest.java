package others;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayTest {
    @Test
    public void removeInd() {
        int[] in = {1, 2, 3};
        int[] actual = Array.removeInd(in, 0);
        int[] expected = {2, 3};
        Assert.assertArrayEquals(expected, actual);
    }
}