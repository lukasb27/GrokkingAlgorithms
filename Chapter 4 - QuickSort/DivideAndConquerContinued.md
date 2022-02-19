# Divide and Conquer 

## Divide and Conquer - Example 2

You're given an array of numbers, you need to add all the numbers and return the total. 

Although this is simple to do with a for loop, lets pretend for now they dont exist as it'd be cool to do this with recursion.

As with all recursive functions, lets conisder what the base case is. 

For this example the base case should be when the length of the array is 0, at this point there is no more integers to process and the function should exit. 

Remember that in recursion the goal is to move closer to an empty array, this can be shortcuted a bit if you consider the following example. 

I have implemented a function 'sum' that sums ints in an array. 

sum([2, 4, 6] = 12. 

this is the exact same as 2 + sum([4, 6]).

With the second example you decreased the size of the array that gets passed into the recursive function.

