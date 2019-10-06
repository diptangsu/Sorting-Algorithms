// Java program for recursive implementation
// of Bubble sort

import java.util.Arrays

class RecursiveBubbleSort {
    // A function to implement bubble sort
    private fun bubbleSort(arr: IntArray, n: Int) {
        // Base case
        if (n == 1)
            return

        // One pass of bubble sort. After
        // this pass, the largest element
        // is moved (or bubbled) to end.
        for (i in 0 until n - 1)
            if (arr[i] > arr[i + 1]) {
                // swap arr[i], arr[i+1]
                val temp = arr[i]
                arr[i] = arr[i + 1]
                arr[i + 1] = temp
            }

        // Largest element is fixed,
        // recur for remaining array
        bubbleSort(arr, n - 1)
    }

    // Driver Method
    fun main(args: Array<String>) {
        val arr = intArrayOf(64, 34, 25, 12, 22, 11, 90)

        bubbleSort(arr, arr.size)

        System.out.println("Sorted array : ")
        System.out.println(Arrays.toString(arr))
    }
}
