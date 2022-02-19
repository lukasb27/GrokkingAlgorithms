# Recursion

## Introduction to recursion 
Consider a scenario where you are looking for an item inside a box. You open the box and there are boxes within that box! Those boxes have even more boxes inside. 

There are two approaches to do finding the item you are looking for. 

The first approach could be to:
1. Make a pile of boxes to look through.
2. Grab a box and look through it.
3. If you find a box, add it to your pile to look through later.
4. If you find a Key, youre done! 
5. Repeat with a new box. 

The second approach could be to:
1. Go through every item in the box.
2. If you find a box, go to step 1. 
3. If you find a key, you're done.

The first and second approach both achieve the same thing with the first approach using the equivalent of a while loop (while pile of boxes isnt empty) whilst the second item uses recursion! 

There is no necessary performance benefit for using recursion over a loop however they can be considered much more readable. 

## Base case and recursive case

Because recursive functions call themself it can be easy to write this function incorrectly and call an infinite loop. When creating a recursive function you need to tell it when it needs to stop calling itself. 

Every recursive function must have two parts, a base case and a recursive case. 

The recursive case is when the function calls itself and the base case is when the function doesnt call itself, therefor stopping an infinte loop. 

