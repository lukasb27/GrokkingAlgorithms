# Binary Search
Binary search can be done to find an item in an ordered list. 

For example, you may be looking for a number between 1-100. Say in this example the number is 67.

You could start by guessing 1,2,3.....65,66,67. This could take anywhere from 0-100 guesses! This could be described as O(n). 

It is described as O(n) as for n amount of items in the worst case it will take n guesses to get the correct answer. In the 1-100 example if your answer was 100 it would take 100 guesses, 1-200 it could take 200 guesses, 1-300 it would take 300 etc.

Instead you could start by guessing 50, finding out if its too high or low. In this case it is too low so now you know the number is between 51-100. 

You can now split your array into a sub-array (51...100). You can repeat the process and guess 75. In this case its too high so you can split your array again into a sub array. In this case now 51-74. 

Repeat and guess if the middle of your new array (51...74) is right. 63 is too low! etc.

The final flow for this array would look like:

(1-100), (51-100), (51-74), (63-74), (63-69), (66-69), (66-67), (67) Correct guess! This only took 7 steps to get to the correct number, rather than 67 if the previous method, Simple Search, was used.

This new technique is called Binary Search. Its big O notation can be described as O(log n). 

Binary search will only work when it is presented in a sorted list.




