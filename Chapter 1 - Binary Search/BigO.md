# Big O Notation

Big O notation is used to tell a programmer how fast an algorithm is. This is important when you use other programmers algorithms and you need to understand the efficiency of the algorithm and which is best to use in a given scenario. 

However, Algorithm running speed can grow at different rates. 

Compare the previous examples of Simple Search and Binary search. 

If it takes 1 millisecond to check an element, with simple search Bob will have to check 100 elements and it takes 100ms. Going from the Log2 method for calculating the amount of steps the maximum a binary search could take it will take 7 steps (log2 100 is roughly 7). So a binary search would take 7ms compared to 100ms for a simple search.

In this instance Binary Search is faster but only by 93ms which is not a lot of time.

However, lets think of an example where rather than 100 elements there are a billion elements. 

For binary search we can calculate log2 of 1 billion where each element again takes 1ms. log2 of 1billion is roughly 30ms, still faster than searching for 100 elements using simple search! 

However, if simple search was to be used on the same array of 1 billion elements it would take 1 billion milliseconds! This is the equivalent of:
- 16666 minutes,
- 277 hours,
- 11.5 days! 

In this example binary search blows simple search out of the water in terms of efficiency. 

Consider the code example provided in this folder. It looks for the number and returns the index of that number in the list. How can Big O provide an efficiency when it could be searching for the number 2 in the list of [1..100], in this example simple search would be much faster than binary search. It could also be searching for the number 99 in the list of [1-100], for this example binary search would be much faster.

**Binary search always presumes the worse-case run time**



