# Selection Sort

Consider the following table that lists films and the amount of times i've seen them.

| Film          | Times Watched |
|---------------|---------------|
| Batman        | 8             |
| Spiderman     | 15            |
| The Prestige  | 3             |
| Step Brothers | 1             |
| Harry Potter  | 6             |

I would like to sort the table into the most watched so i can work out my most favourite and least favourite films. 

You could do this by looking through the table and finding the most watched film, then adding that to the table. Repeat this step for the amount of entries in a table and you will end up with a sorted table (list).

| Film          | Times Watched |        
|---------------|---------------|
| Batman        | 8             |
| Spiderman     | 15            |
| The Prestige  | 3             |
| Step Brothers | 1             |
| Harry Potter  | 6             | 

will become:

| Film      | Times Watched |
|-----------|---------------|
| Spiderman | 15            |

etc.. 

until the table is sorted.

| Film          | Times Watched |
|---------------|---------------|
| Spiderman     | 15            |
| Batman        | 8             |
| Harry Potter  | 6             |
| The Prestige  | 3             |
| Step Brothers | 1             |

Now lets talk about the big o notation for this type of sorting algorithm. O(n) means that you touch every element in the list once and during this sort we touch every item in the list once to read the times watched but this has to be done once for every item in the list, therefor the big notation for selection sort is O(n^2)!

In summary, selection sort is an algorithm that can be used for sorting, however as its run time is O(n^2) it is a slower algorithm.
