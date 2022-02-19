# Call stacks and Recursion.

Recursive functions are no exceptions to using the call stack when they run.

Consider a factorial function, factorial is wrriten as ! and is the multiplication of the numbers and all the numbers before it. 

e.g factorial(5)/5! = 5 * 4 * 3 * 2 * 1 

How does the stack look on a recursive function that returns the factorial for an integer.

Consider calling this function with a value of 3.

1. The call stack creates the first 'box', this has the function name and variable value, in this case 3. 
2. The function is called again from within the function, a new box is created with the function name and variable value, now 2. This box is on the top of the queue.
3. The first box is 'paused' it is in a partially complete state but still takes up memory, the box isnt removed.
4. The function is called again within the function, the value of the variable is now 1. This reaches the base case which means the function returns! The second box is paused.
5. As the function returns it causes a topple effect and unpauses all the paused previous boxes and all the previously paused functions can now complete, popping them from the stack and clearing it. Finally your result is returned. 

Look at the code in this folder for an example of the factorial function in the real world. 