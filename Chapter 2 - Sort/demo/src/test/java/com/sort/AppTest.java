package com.sort;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void findSmallestIntInArray()
    {   
        List<Integer> unsortedInts = new ArrayList<Integer>( Arrays.asList(5, 3, 6, 2, 10));
        int smallestIntIndex = App.findSmallest(unsortedInts);
        assertEquals(3, smallestIntIndex);
    }

    @Test
    public void selectionSortTests()
    {
        List<Integer> unsortedInts = new ArrayList<Integer>( Arrays.asList(5, 3, 6, 2, 10) );
        List<Integer> sortedInts = App.selectionSort(unsortedInts);
        List<Integer> expectedSortedInts = new ArrayList<Integer>( Arrays.asList(2, 3, 5, 6, 10) );

        
        assertEquals(expectedSortedInts, sortedInts);
    }
}
