import java.util.Scanner

class QuickSort {
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        System.out.print("Enter the number of elements : ")
        val n = sc.nextInt()
        val arr = IntArray(n)
        System.out.println("Enter $n elements :")
        for (i in 0 until n)
            arr[i] = sc.nextInt()

        quickSort(arr, 0, n - 1)

        System.out.println("\nThe sorted array : ;")
        for (i in 0 until n)
            System.out.print(arr[i].toString() + " ")
        System.out.println()
    }

    /**
     * @param arr   The array/sub-array to be sorted
     * @param lower lower index
     * @param upper upper index
     */
    internal fun quickSort(arr: IntArray, lower: Int, upper: Int) {
        if (lower >= upper)
            return
        val p = partition(arr, lower, upper)
        quickSort(arr, lower, p - 1)
        quickSort(arr, p + 1, upper)
    }

    /**
     * @param arr   The array of elements
     * @param lower The lower index of the elements
     * @param upper The upper index of the elements
     * @return The index of the pivot element
     */
    private fun partition(arr: IntArray, lower: Int, upper: Int): Int {
        val pivot = arr[upper]
        var j = lower
        var tmp: Int
        for (i in lower..upper) {
            if (arr[i] < pivot) {
                tmp = arr[i]
                arr[i] = arr[j]
                arr[j] = tmp
                j++
            }
        }
        tmp = arr[upper]
        arr[upper] = arr[j]
        arr[j] = tmp

        return j
    }
}
