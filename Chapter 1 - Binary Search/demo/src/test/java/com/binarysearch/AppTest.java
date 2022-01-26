package com.binarysearch;

import static org.hamcrest.CoreMatchers.instanceOf;

import org.hamcrest.Matcher;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Assert.*;



/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testAppBinarySearch()
    // The method should accept two parameters, an array and the number to search for. 
    // It should return an int.
    // Which in this case should be the index in the array of the request number.
    {   
        int[] numbers = {0, 3, 5, 7, 9, 11};

        // Test that the algorithm succesfully returns the correct indexs for the request number.
        assertEquals(App.binarySearch(numbers, 0), 0);
        assertEquals(App.binarySearch(numbers, 3), 1);  
        assertEquals(App.binarySearch(numbers, 5), 2);  
        assertEquals(App.binarySearch(numbers, 7), 3);  
        assertEquals(App.binarySearch(numbers, 9), 4);  
        assertEquals(App.binarySearch(numbers, 11), 5);     
    }

    public void testAppBinarySearchNothingFound()
    // As above, but this time testing that if a
    // number is passed that is not in the list it returns a value of -1
    {   
        int[] numbers = {0, 3, 5, 7, 9, 11};

        // Test that the algorithm returns -1 for the value 8 which is not in the Array.
        assertEquals(App.binarySearch(numbers, 8), -1);    
    }
}
