package com.sort;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Integer> unsortedInts = new ArrayList<Integer>( Arrays.asList(5, 3, 6, 2, 10) );
        List<Integer> sortedInts = App.selectionSort(unsortedInts);
        System.out.println(sortedInts);
    }

    public static int findSmallest( List<Integer> unsortedInts)
    {
        int smallest = unsortedInts.get(0);
        int smallest_index = 0;
        for (int i = 0; i < unsortedInts.size(); i++) {
            if (unsortedInts.get(i) < smallest) {
                smallest = unsortedInts.get(i);
                smallest_index = i;
            }
        }
        return smallest_index;
    }

    public static List<Integer> selectionSort(List<Integer> unsortedInts)
    {   
        List<Integer> sortedInts = new ArrayList<Integer>();
        // int range = unsortedInts
        for (int i = 0; i <= 4; i++) {
            int smallestItemIndex = App.findSmallest(unsortedInts);
            sortedInts.add(unsortedInts.get(smallestItemIndex));
            unsortedInts.remove(smallestItemIndex);
        }
        return sortedInts;
    }
}

