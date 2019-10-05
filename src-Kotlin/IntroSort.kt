import java.util.Random
import java.util.Scanner

class IntroSort {

    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        System.out.print("Enter the number of elements : ")
        val n = sc.nextInt()
        val arr = IntArray(n)
        System.out.println("Enter $n elements :")
        for (i in 0 until n)
            arr[i] = sc.nextInt()

        introSort(arr, 0, n - 1, calcDepth(arr))

        System.out.println("\nThe sorted array : ;")
        for (i in 0 until n)
            System.out.print(arr[i].toString() + " ")
        System.out.println()

    }

    /**
     *
     * @param arr
     * The array of elements
     * @param low
     * The lowest array index to sort
     * @param high
     * The highest array index to sort
     * @param depth
     * The maximum recursion depth
     */
    internal fun introSort(arr: IntArray, low: Int, high: Int, depth: Int) {
        val p = partition(arr, low, high)
        if (high - low < 2) {
            return
        } else if (p > depth) {
            HeapSort.heapSort(arr)
        } else {
            introSort(arr, low, p, depth - 1)
            introSort(arr, p + 1, high, depth - 1)
        }
    }

    /**
     *
     * @param arr
     * The array of elements
     * @param low
     * The lowest array index to sort
     * @param high
     * The highest array index to sort
     * @return The pivot index
     */
    private fun partition(arr: IntArray, low: Int, high: Int): Int {
        val p = getPivot(arr, low, high)
        var j = low

        for (i in low..high) {
            if (arr[i] < p) {
                swap(arr, i, j)
                j++
            }
        }
        swap(arr, high, j)

        return j
    }

    /**
     *
     * @param arr
     * The array of elements
     * @param low
     * The lowest array index to sort
     * @param high
     * The highest array index to sort
     * @return A pivot index
     */
    private fun getPivot(arr: IntArray, low: Int, high: Int): Int {
        val rd = Random()
        return arr[rd.nextInt(high - low + 1) + low]
    }


    /**
     *
     * @param arr
     * The array of elements for swap
     * @param x
     * One of the element for swap
     * @param y
     * Another element to swap
     */
    private fun swap(arr: IntArray, x: Int, y: Int) {
        val aux = arr[x]
        arr[x] = arr[y]
        arr[y] = aux
    }

    /**
     *
     * @param arr
     * The array of elements
     * @return The maximum recursion depth of array
     */
    internal fun calcDepth(arr: IntArray): Int {
        return Math.log(arr.size) as Int * 2
    }
}
