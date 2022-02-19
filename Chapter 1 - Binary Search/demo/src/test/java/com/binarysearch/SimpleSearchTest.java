package com.binarysearch;



import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Assert.*;




/**
 * Unit test for simple App.
 */
public class SimpleSearchTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SimpleSearchTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SimpleSearchTest.class );
    }

    private int[] generateNumbers() {
        int[] numbers = new int[10000];
        for(int i = 0; i < 10000; i++){
            numbers[i] = i;
        }
        return numbers;
    }

    int[] numbers = generateNumbers(); 

    public void testAppSimpleSearchTest()
    // The method should accept two parameters, an array and the number to search for. 
    // It should return an int.
    // Which in this case should be the index in the array of the request number.
    {   
        // Test that the algorithm succesfully returns the correct indexs for the request number.
        assertEquals(App.simpleSearch(this.numbers, 1), 1);
        assertEquals(App.simpleSearch(this.numbers, 100), 100); 
        assertEquals(App.simpleSearch(this.numbers, 500), 500);  
        assertEquals(App.simpleSearch(this.numbers, 1000), 1000);  
        assertEquals(App.simpleSearch(this.numbers, 5000), 5000);  
        assertEquals(App.simpleSearch(this.numbers, 9000), 9000);  
    }

    public void testAppSimpleSearchNothingFound()
    // As above, but this time testing that if a
    // number is passed that is not in the list it returns a value of -1
    {   
        // Test that the algorithm returns -1 for the value 8 which is not in the Array.
        assertEquals(App.simpleSearch(this.numbers, 10000000), -1);    
    }
}
