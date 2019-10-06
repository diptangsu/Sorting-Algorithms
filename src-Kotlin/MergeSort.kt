import java.util.Scanner

class MergeSort {
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        System.out.print("Enter the number of elements : ")
        val n = sc.nextInt()
        val arr = IntArray(n)
        System.out.println("Enter $n elements :")
        for (i in 0 until n)
            arr[i] = sc.nextInt()

        mergeSort(arr, 0, n - 1)
        System.out.println("\nThe sorted array : ;")
        for (i in 0 until n)
            System.out.print(arr[i].toString() + " ")
        System.out.println()
    }

    internal fun mergeSort(arr: IntArray, lower: Int, upper: Int) {
        if (lower >= upper)
            return
        val m = (lower + upper) / 2
        mergeSort(arr, lower, m)
        mergeSort(arr, m + 1, upper)
        merge(arr, lower, upper)
    }

    private fun merge(arr: IntArray, lower: Int, upper: Int) {
        val m = (lower + upper) / 2
        val a = IntArray(m - lower + 1)
        val b = IntArray(upper - m)
        var i: Int
        var k = 0
        var k1 = 0
        var k2 = 0
        i = lower
        while (i <= m) {
            a[k] = arr[i]
            i++
            k++
        }
        k = 0
        while (i <= upper) {
            b[k] = arr[i]
            i++
            k++
        }
        i = lower
        while (i <= upper && k1 < m - lower + 1 && k2 < upper - m) {
            if (a[k1] < b[k2]) {
                arr[i] = a[k1]
                k1++
            } else {
                arr[i] = b[k2]
                k2++
            }
            i++
        }
        while (k1 < m - lower + 1) {
            arr[i++] = a[k1]
            k1++
        }
        while (k2 < upper - m) {
            arr[i++] = b[k2]
            k2++
        }
    }
}
