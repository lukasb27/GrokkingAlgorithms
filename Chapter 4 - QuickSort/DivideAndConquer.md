# Divide and Conquer

Suppose you're a farmer with a plot of land 1680*640, you want to divide the farm with the following conditions:
1. The plots must be square.
2. The plots must all be the same size.
3. The plots must be as big as possible.

Using a divide and conquer algorithm you can calculate the best sizes for your plots that meet the above criteria. 

Divider and Conquer algorithms are recursive algorithms and to solve a problem with it you you need to follow the two steps:
1. Figure out the base case.
2. Decrease your problem until it becomes the base case. 
   
So, as discussed the first step is to figure out the base case for our farmers issue. 

The easiest way to calculate the base case is if one side is a multiple of the other side. Lets say 50 * 25. 

In the case of our farmers land, the height is 640 meters and the width is 1680 meters, so the largest square size you can use is 640 * 640. 

| 640 * 640 | 640 * 640  | 640 * 400 |
|-----------|------------|-----------|

After using this method we have split our land into three shapes, two squares and a final rectangle of 640 * 400.

The same algorithm can now be applied to the smaller, odd shape! If you find the biggest box for the size it will be the biggest box for the whole farm. (The concept for this is called Euclids algorithm). 

So now apply the same algorithm to the new box, it can be split into one 400 * 400 square and one 240 * 400 square.

To cut a long story short, keep doing this until you get to the base case, aka a square. In this example that is 80 * 80. 

Our farmers field can be split into a plot that is 21  plots wide and 8 heigh.

## Recaping D&C.

1. Figure out a simple case as the base case.
2. Figure out how to reduce your problem and get to the actual base case.





