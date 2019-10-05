// Java program for implementation of QuickSort
import java.util.*

internal class QuickSortIterative {
    /* This function takes last element as pivot,
	places the pivot element at its correct
	position in sorted array, and places all
	smaller (smaller than pivot) to left of
	pivot and all greater elements to right
	of pivot */
    fun partition(arr: IntArray, low: Int, high: Int): Int {
        val pivot = arr[high]
        var i = low - 1 // index of smaller element
        for (j in low..high - 1) {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot) {
                i++

                // swap arr[i] and arr[j]
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        val temp = arr[i + 1]
        arr[i + 1] = arr[high]
        arr[high] = temp

        return i + 1
    }

    /* The main function that implements QuickSort()
	arr[] --> Array to be sorted,
	low --> Starting index,
	high --> Ending index */
    fun qSort(arr: IntArray, low: Int, high: Int) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
			now at right place */
            val pi = partition(arr, low, high)

            // Recursively sort elements before
            // partition and after partition
            qSort(arr, low, pi - 1)
            qSort(arr, pi + 1, high)
        }
    }

    // Driver code
    fun main(args: Array<String>) {

        val n = 5
        val arr = intArrayOf(4, 2, 6, 9, 2)

        qSort(arr, 0, n - 1)

        for (i in 0 until n) {
            System.out.print(arr[i].toString() + " ")
        }

    }
}
