package NumerosPrimos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class StonePileTest {
    @Test
    public void testMinDifference() {
        int[] weights = {5, 10, 15, 20, 25};
        assertEquals(5, StonePile.minDifference(weights, 5, 0, 0));
    }

    @Test
    public void testMinDifference3() {
        int[] weights = {5, 8, 13, 27, 14};
        assertEquals(3, StonePile.minDifference(weights, 5, 0, 0));
    }
    @Test
    public void testMinDifference2() {
        int[] weights = {100,50,20,20,10};
        assertEquals(0, StonePile.minDifference(weights, weights.length, 0, 0));
    }
    @Test
    public void testMinDifference4() {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        assertEquals(1, StonePile.minDifference(weights, weights.length, 0, 0));
    }
    @Test
    public void testMinDifference5() {
        int[] weights = {14,15,16,31,10};
        assertEquals(4, StonePile.minDifference(weights, weights.length, 0, 0));
    }

    @Test
    public void testMinDifference6() {
        int[] weights = {20,15,84,13,54,27};
        assertEquals(5, StonePile.minDifference(weights, weights.length, 0, 0));
    }


}
