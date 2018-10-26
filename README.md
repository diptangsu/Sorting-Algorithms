# Sorting-Algorithms
All programs are written in java.

Programs written and compiled using IntelliJ IDEA

The .java files can be found in \src

It is incomplete and might contain a few mistakes. Please inform if mistakes are found.

## Bubble Sort
Bubble sort, sometimes referred to as sinking sort, is a simple sorting algorithm that repeatedly steps through the list to be sorted, compares each pair of adjacent items and swaps them if they are in the wrong order. The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted. The algorithm, which is a comparison sort, is named for the way smaller or larger elements "bubble" to the top of the list. Although the algorithm is simple, it is too slow and impractical for most problems even when compared to insertion sort. Bubble sort can be practical if the input is in mostly sorted order with some out-of-order elements nearly in position.

Time complexity analysis:

|Worst Case|Average Case|Best Case|
|---|---|---|
|O(n<sup>2</sup>)|O(n<sup>2</sup>)|Ω(n)|

|In-place?|Stable?|
|---|---|
|Yes|Yes|


## Selection Sort
Selection sort is a sorting algorithm, specifically an in-place comparison sort. It has O(n2) time complexity, making it inefficient on large lists, and generally performs worse than the similar insertion sort. Selection sort is noted for its simplicity, and it has performance advantages over more complicated algorithms in certain situations, particularly where auxiliary memory is limited.

The algorithm divides the input list into two parts: the sublist of items already sorted, which is built up from left to right at the front (left) of the list, and the sublist of items remaining to be sorted that occupy the rest of the list. Initially, the sorted sublist is empty and the unsorted sublist is the entire input list. The algorithm proceeds by finding the smallest (or largest, depending on sorting order) element in the unsorted sublist, exchanging (swapping) it with the leftmost unsorted element (putting it in sorted order), and moving the sublist boundaries one element to the right.  

Time complexity analysis:

|Worst Case|Average Case|Best Case|
|---|---|---|
|O(n<sup>2</sup>)|O(n<sup>2</sup>)|Ω(n<sup>2</sup>)|

|In-place?|Stable?|
|---|---|
|Yes|No|


## Insertion Sort
Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.
Insertion sort iterates, consuming one input element each repetition, and growing a sorted output list. At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list, and inserts it there. It repeats until no input elements remain.  

Time complexity analysis:

|Worst Case|Average Case|Best Case|
|---|---|---|
|O(n<sup>2</sup>)|O(n<sup>2</sup>)|Ω(n)|

|In-place?|Stable?|
|---|---|
|Yes|Yes|


## Counting Sort
Counting sort is an algorithm for sorting a collection of objects according to keys that are small integers; that is, it is an integer sorting algorithm. It operates by counting the number of objects that have each distinct key value, and using arithmetic on those counts to determine the positions of each key value in the output sequence. Its running time is linear in the number of items and the difference between the maximum and minimum key values, so it is only suitable for direct use in situations where the variation in keys is not significantly greater than the number of items. However, it is often used as a subroutine in another sorting algorithm, radix sort, that can handle larger keys more efficiently.

Time complexity analysis:

|Worst Case|Average Case|Best Case|
|---|---|---|
|O(n+k)|O(n+k>)|Ω(n+k)|

|In-place?|Stable?|
|---|---|
|No|Yes|


## Cycle Sort
Cycle sort is an in-place, unstable sorting algorithm, which is a comparison sort that is theoretically optimal in terms of the total number of writes to the original array, unlike any other in-place sorting algorithm. It is based on the idea that the permutation to be sorted can be factored into cycles, which can individually be rotated to give a sorted result.

Time complexity analysis:

|Worst Case|Average Case|Best Case|
|---|---|---|
|O(n<sup>2</sup>)|O(n<sup>2</sup>)|Ω(n<sup>2</sup>)|

|In-place?|Stable?|
|---|---|
|Yes|No|


## Heap Sort
Heapsort is a comparison-based sorting algorithm. Heapsort can be thought of as an improved selection sort: like that algorithm, it divides its input into a sorted and an unsorted region, and it iteratively shrinks the unsorted region by extracting the largest element and moving that to the sorted region. The improvement consists of the use of a heap data structure rather than a linear-time search to find the maximum.

The heapsort algorithm involves preparing the list by first turning it into a max heap. The algorithm then repeatedly swaps the first value of the list with the last value, decreasing the range of values considered in the heap operation by one, and sifting the new first value into its position in the heap. This repeats until the range of considered values is one value in length.  

Time complexity analysis:

|Worst Case|Average Case|Best Case|
|---|---|---|
|O(n log(n))|O(n log(n))|Ω(n) (bottom up)|

|In-place?|Stable?|
|---|---|
|Yes|No|


## Merge Sort
Merge sort is an efficient, general-purpose, comparison-based sorting algorithm. Most implementations produce a stable sort, which means that the implementation preserves the input order of equal elements in the sorted output. Merge sort is a divide and conquer algorithm.
Conceptually, a merge sort works as follows:

1. Divide the unsorted list into n sublists, each containing 1 element (a list of 1 element is considered sorted).
2. Repeatedly merge sublists to produce new sorted sublists until there is only 1 sublist remaining. This will be the sorted list.  

Time complexity analysis:

|Worst Case|Average Case|Best Case|
|---|---|---|
|O(n log(n))|O(n log(n))|Ω(n log(n))|

|In-place?|Stable?|
|---|---|
|No|Yes|


## Quick Sort
Quicksort (sometimes called partition-exchange sort) is an efficient sorting algorithm, serving as a systematic method for placing the elements of an array in order. When implemented well, it can be about two or three times faster than its main competitors, merge sort and heapsort.

Quicksort is a comparison sort, meaning that it can sort items of any type for which a "less-than" relation (formally, a total order) is defined. In efficient implementations it is not a stable sort, meaning that the relative order of equal sort items is not preserved. Quicksort can operate in-place on an array, requiring small additional amounts of memory to perform the sorting. It is very similar to selection sort, except that it does not always choose worst-case partition.  

Time complexity analysis:

|Worst Case|Average Case|Best Case|
|---|---|---|
|O(n<sup>2</sup>)|O(n log(n))|Ω(n log(n))|

|In-place?|Stable?|
|---|---|
|Yes|No|


## Radix Sort
Radix sort is a non-comparative integer sorting algorithm that sorts data with integer keys by grouping keys by the individual digits which share the same significant position and value. A positional notation is required, but because integers can represent strings of characters (e.g., names or dates) and specially formatted floating point numbers, radix sort is not limited to integers.  

Time complexity analysis:

|Worst Case|Average Case|Best Case|
|---|---|---|
|O(n<sup>2</sup>)|O(nk)|Ω(nk)|

|In-place?|Stable?|
|---|---|
|Depends on implementation|Depends on implementation|


## Cocktail Sort
Cocktail Sort is a variation of Bubble sort. The Bubble sort algorithm always traverses elements from left and moves the largest element to its correct position in first iteration and second largest in second iteration and so on. Cocktail Sort traverses through a given array in both directions alternatively.

Time complexity analysis:

|Worst Case|Average Case|Best Case|
|---|---|---|
|O(n<sup>2</sup>)|O(n<sup>2</sup>)|Ω(n)|

|In-place?|Stable?|
|---|---|
|Yes|Yes|


## Bogo Sort
Also known as Permutation Sort. Stupid Sort, Slowsort, Shotgun Sort, or Monkey Sort, Bogosort randomly generates permutations of the input and checks if it is sorted until it generates one that happens to be sorted by chance. Not meant to be an efficient sort, Bogosort is largely used for educational purposes and for comparison to actual sorting algorithms for contrast. It has a best case of O(n) where the list is already sorted, an average performance of O((n+1)!) and an unbounded worst case performance.

Time complexity analysis:

|Worst Case|Average Case|Best Case|
|---|---|---|
|Unbounded|O((n+1)!)|Ω(n)|

|In-place?|Stable?|
|---|---|
|Yes|No|


## Shell Sort
Shellsort, also known as Shell sort or Shell's method, is an in-place comparison sort. It can be seen as either a generalization of sorting by exchange (bubble sort) or sorting by insertion (insertion sort).The method starts by sorting pairs of elements far apart from each other, then progressively reducing the gap between elements to be compared. Starting with far apart elements, it can move some out-of-place elements into position faster than a simple nearest neighbor exchange. Donald Shell published the first version of this sort in 1959.The running time of Shellsort is heavily dependent on the gap sequence it uses. For many practical variants, determining their time complexity remains an open problem.

Time complexity analysis:

|Worst Case|Average Case|Best Case|
|---|---|---|
|O(n<sup>2</sup>)|Depends on Implementation|Ω(n log(n))|

|In-place?|Stable?|
|---|---|
|Yes|No|


## IntroSort
Introsort or introspective sort is a hybrid sorting algorithm that provides both fast average performance and (asymptotically) optimal worst-case performance. It begins with quicksort and switches to heapsort when the recursion depth exceeds a level based on (the logarithm of) the number of elements being sorted. This combines the good parts of both algorithms, with practical performance comparable to quicksort on typical data sets and worst-case O(n log n) runtime due to the heap sort. Since both algorithms it uses are comparison sorts, it too is a comparison sort.


## Comparison Sort
Comparison sorts compare elements at each step of the algorithm to determine if one element should be to the left or right of another element.
Comparison sorts are usually more straightforward to implement than integer sorts, but comparison sorts are limited by a lower bound of Ω(n log n), meaning that, on average, comparison sorts cannot be faster than Ω(n log n). A lower bound for an algorithm is the worst-case running time of the best possible algorithm for a given problem. The "on average" part here is important: there are many algorithms that run in very fast time if the inputted list is already sorted, or has some very particular (and overall unlikely) property. There is only one permutation of a list that is sorted, but n! possible lists, so the chances that the input is already sorted is very unlikely, and on average, the list will not be very sorted.


# Contribute
1. Fork this repository
2. Clone it
3. Create a new branch with an appropriate name
4. Commit changes to that branch
5. Push changes to your forked repository
6. Create a pull request
