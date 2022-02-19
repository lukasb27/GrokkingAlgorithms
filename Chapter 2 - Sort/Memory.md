# Memory, Arrays and Linked List

## Memory 
Memory on a computer can be considered a large chest of drawers. You can store stuff in each drawer and each drawer will have an address that can be used to interact with that drawer. 

Interactions could be things such as storing, and retrieving data. 

If you want to store multiple items you will need to use either an array or a list. 

## Arrays and Linked lists.

Consider an application that stores a list of tasks that you need to finish. You would want to store the items of your todo list in memory. 

Now you can consider whether or not to use a linked list or an array. 

To start with use an array. 

When storing items in an array they are stored next to each other in the chest of drawers (memory).

What would happen in the scenario that the drawer next to the current drawer you're occupying is taken?

Look at the diagram below, you're trying to write x to memory, but the fourth drawer already has an o in it. 

[x][x][x][o]

You dont have enough space in that chunk of memory to store your array! You now need to go back to the computer to allocate a new chunk of memory to your program. 

This makes adding items to an array troublesome, as you may need to request a new chunk of memory everytime to cope with the expansion of your array. 

You can however hold seats for your application by requesting more memory than your application needs. 

If you think your application may need up to 10 slots in the memory, you can request 10 even if you are only currently using 3. 

However, what if you only use 3 in total? You are wasting space in memory for your application. 

Alternatively you may expand beyond 10 and end up needing to request more memory anyway. 

Linked lists solve this problem. 

## Linked Lists.

With a linked list you can store your item in any of the drawers in your set.

Each item will not only store the data you have put in it but also the address of the next item in the linked list. 

With a linked list you will neve rhave to move your items, you can split your list up indefinitely. 

To counter arrays, linked lists are very fast for inserts.

## Pros and Cons

As explained, arrays are much slower if you need to add data to the array as it may have to search for a new chunk of memory to fit your new array into.

However, a linked list is faster for additions but much slower for general reading. With a linked list you cannot randomly find the data at element X (where X is higher than 0). This is because the address for X is always stored at x-1, you must be start at position 0 and work your way up to X. Due to this issue linked lists are slower than arrays for randomly accessing data.

Arrays have a run time of O(1) for reading and O(n) for insertion. 
Linked lists have a run time of O(n) for reading and O(1) for insertion. 

## Inserting things into the middle of your list.

Consider now how you would go and insert something into the middle of your list? 

With an array you stumble across the common problem of having to move to make room, where a linked list you can simply update the address for the element before to point to the new item and add the next address to your new item. Easy. 

linked lists are better for inserting data into the middle of the list.

## Deleting

When you are deleting from an array everything needs to be shifted up one. With a linked list you can simply delete the item, update the address for the item to the left and be on your way.

## Summary.

To summarise, you should use an array for when you have data of a fixed length, where you may need to randomly access the data. 

A linked list should be used if you need to write lots to the list or if you're using sequential access (where you are accessing data one after the other.)



