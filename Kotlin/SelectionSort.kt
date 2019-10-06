import java.util.Scanner

class SelectionSort {

    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        System.out.print("Enter the number of elements : ")
        val n = sc.nextInt()
        val arr = IntArray(n)
        System.out.println("Enter $n elements :")
        for (i in 0 until n)
            arr[i] = sc.nextInt()

        selectionSort(arr)

        System.out.println("\nThe sorted array : ;")
        for (i in 0 until n)
            System.out.print(arr[i].toString() + " ")
        System.out.println()
    }

    internal fun selectionSort(arr: IntArray) {
        val len = arr.size
        var pos: Int
        var tmp: Int
        for (i in 0 until len) {
            pos = i
            for (j in i + 1 until len) {
                if (arr[j] < arr[pos])
                    pos = j
            }
            tmp = arr[i]
            arr[i] = arr[pos]
            arr[pos] = tmp
        }
    }
}
