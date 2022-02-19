package com.divideandconquer;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testSumMethod()
    {
        int[] test1 = {2, 4, 6};
        int[] test2 = {5, 5, 5};
        int[] test3 = {3, 3, 3, 3};
        int[] test4 = {5, 2};
        assertEquals(12, App.sum(test1));
        assertEquals(15, App.sum(test2));
        assertEquals(12, App.sum(test3));
        assertEquals(7, App.sum(test4));
    }
}
