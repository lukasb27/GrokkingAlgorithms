package com.binarysearch;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int binarySearch(int[] Numbers, int wantedNumber)
    {
        // low and high are needed to keep a track of which part of the array is being searched.
        int lowestNumber = 0;
        int highestNumber = Numbers.length - 1;

        // While the element is not limited down to one.
        while (lowestNumber <= highestNumber) {
            // Find the index for the  middle element.
            int middleNumber = (lowestNumber + highestNumber) / 2;

            // Get the value of the middle item in the array, using the index gained previously..
            int guess = Numbers[middleNumber];

            // Check the if the middle element of the array is equal to the wanted number
            if (guess == wantedNumber) {
                return middleNumber;
            }

            // If the value is too high get the bottom half of the array.
            if (guess > wantedNumber){
                highestNumber = middleNumber - 1;
            }
            // Else, if its too low get the top half of the array.
            else {
                lowestNumber = middleNumber + 1;
            }
        }
        // If the item isnt in the array, return -1 to indicate its not there.
        return -1;
    }

    public static int simpleSearch(int[] Numbers, int wantedNumber)
    {
        // Loop through the numbers array till you get the correct answer.
        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] == wantedNumber) {
                return i;
            }
        }
        // If the item isnt in the array, return -1 to indicate its not there.
        return -1;
    }
}
