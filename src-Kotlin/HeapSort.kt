import java.util.Arrays
import java.util.Scanner

class HeapSort {
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        System.out.print("Enter the number of elements : ")
        val n = sc.nextInt()
        val arr = IntArray(n)
        System.out.println("Enter $n elements :")
        for (i in 0 until n)
            arr[i] = sc.nextInt()

        heapSort(arr)
        System.out.println("\nThe sorted array : ")
        System.out.println(Arrays.toString(arr))

    }

    internal fun heapSort(arr: IntArray) {
        makeMaxHeap(arr)
        var tmp: Int
        for (i in arr.size - 1 downTo 1) {
            tmp = arr[0]
            arr[0] = arr[i]
            arr[i] = tmp
            heapAdjust(arr, 0, i)
        }
    }

    private fun makeMaxHeap(arr: IntArray) {
        val len = arr.size
        for (i in len / 2 - 1 downTo 0) {
            heapAdjust(arr, i, len)
        }
    }

    private fun heapAdjust(arr: IntArray, i: Int, n: Int) {
        var j = 2 * i + 1
        val tmp = arr[i]
        while (j < n) {
            if (j < n - 1 && arr[j] < arr[j + 1])
                j++
            if (tmp > arr[j])
                break
            arr[(j - 1) / 2] = arr[j]
            j = 2 * j + 1
        }
        arr[(j - 1) / 2] = tmp
    }
}