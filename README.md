# Sorting-Algorithms
All programs are written in java.

Programs written and compiled using IntelliJ IDEA

The .java files can be found in \src

It is incomplete and might contain a few mistakes. Please inform if mistakes are found.

## Bubble Sort
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted. 
The time complexity of bubble sort is O(n<sup>2</sup>).

## Selection Sort
The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.
1) The subarray which is already sorted.
2) Remaining subarray which is unsorted.
In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.  


## Insertion Sort
Insertion sort iterates, consuming one input element each repetition, and growing a sorted output list. At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list, and inserts it there. It repeats until no input elements remain.  
The time complexity is O(n<sup>2</sup>).


## Counting Sort
Counting sort is a sorting technique based on keys between a specific range. It works by counting the number of objects having distinct key values (kind of hashing). Then doing some arithmetic to calculate the position of each object in the output sequence.


## Cycle Sort
Cycle sort is an in-place, unstable sorting algorithm, a comparison sort that is theoretically optimal in terms of the total number of writes to the original array, unlike any other in-place sorting algorithm. It is based on the idea that the permutation to be sorted can be factored into cycles, which can individually be rotated to give a sorted result.


## Heap Sort
Heap sort is a comparison based sorting technique based on Binary Heap data structure. It is similar to selection sort where we first find the maximum element and place the maximum element at the end. We repeat the same process for remaining element.

## Merge Sort
Merge sort is an efficient, general-purpose, comparison-based sorting algorithm. Most implementations produce a stable sort, which means that the implementation preserves the input order of equal elements in the sorted output. Merge sort is a divide and conquer algorithm.
Conceptually, a merge sort works as follows:

1. Divide the unsorted list into n sublists, each containing 1 element (a list of 1 element is considered sorted).
2. Repeatedly merge sublists to produce new sorted sublists until there is only 1 sublist remaining. This will be the sorted list.  

## Quick Sort
QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot. There are many different versions of quickSort that pick pivot in different ways.
The time complexity is O(nlogn)

## Radix Sort
radix sort is a non-comparative integer sorting algorithm that sorts data with integer keys by grouping keys by the individual digits which share the same significant position and value.

## Cocktail Sort
Cocktail Sort is a variation of Bubble sort. The Bubble sort algorithm always traverses elements from left and moves the largest element to its correct position in first iteration and second largest in second iteration and so on. Cocktail Sort traverses through a given array in both directions alternatively.

## Bogo Sort
Also known as Permutation Sort. Stupid Sort, Slowsort, Shotgun Sort, or Monkey Sort, Bogosort randomly generates permutations of the input and checks if it is sorted until it generates one that happens to be sorted by chance. Not meant to be an efficient sort, Bogosort is largely used for educational purposes and for comparison to actual sorting algorithms for contrast. It has a best case of O(n) where the list is already sorted, an average performance of O((n+1)!) and an unbounded worst case performance.

## Shell Sort
ShellSort is mainly a variation of Insertion Sort. In insertion sort, elements are moved only one position ahead. When an element has to be moved far ahead, many movements are involved. The idea of shellSort is to allow exchange of far items. 


# Contribute
1. Fork this repository
2. Clone it
3. Create a new branch with an appropriate name
4. Commit changes to that branch
5. Push changes to your forked repository
6. Create a pull request
