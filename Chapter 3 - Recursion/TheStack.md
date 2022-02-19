# The Stack

## Introduction to stacks.

Think of the scenario where you need to keep a to do list of things to do. In this case the to do list is a stack of sticky notes. 

When you insert an item it will get added to the top of the list. When you read an item you can only read the top item and its then taken off the list because you've read it. 

In this scenario your to do list only has two actions:
- Push, add a new item to the top of the stack.
- Pop, remove the top most item and read it.

This data structure is called a stack. 

## The call stack.

Computers make use of an internal stack called the call stack.

Suppose you call a function in your program. This is the steps your computer will follow:
1. Allocate a box of memory for that function call.
2. Use the memory, say we are setting a variable, name, to the value of Maggie. The computer stores the variable and value in memory.
   
Say you call a second function, what happens in the stack then?

It repeats the steps from before! However this time the memory allocated is stored ontop of the previous memory, forming a stack. 

When you return a function (ie complete the function) you release the memory used and pop it from the stack.

One final thing to note is calling functions from within functions. When this is done your function is paused in a partially completed state within memory. All your variables and values are stored in memory. 



