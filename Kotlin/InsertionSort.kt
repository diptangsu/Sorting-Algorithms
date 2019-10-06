import java.util.Scanner

class InsertionSort {

    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        System.out.print("Enter the number of elements : ")
        val n = sc.nextInt()
        val arr = IntArray(n)
        System.out.println("Enter $n elements :")
        for (i in 0 until n)
            arr[i] = sc.nextInt()

        insertionSort(arr)

        System.out.println("\nThe sorted array : ;")
        for (i in 0 until n)
            System.out.print(arr[i].toString() + " ")
        System.out.println()
    }

    internal fun insertionSort(arr: IntArray) {
        val len = arr.size
        var tmp: Int
        var j: Int
        for (i in 1 until len) {
            tmp = arr[i]
            j = i
            while (j > 0) {
                if (arr[j - 1] > tmp)
                    arr[j] = arr[j - 1]
                else
                    break
                j--
            }
            arr[j] = tmp
        }
    }
}
