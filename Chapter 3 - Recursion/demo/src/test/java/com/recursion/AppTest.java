package com.recursion;

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
    public void testFactorialMethodReturnsCorrectly()
    {
        assertEquals(120, App.factorial(5));
        assertEquals(3628800, App.factorial(10));
    }
}
