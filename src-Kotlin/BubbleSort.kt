import java.util.Scanner

class BubbleSort {

    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        System.out.print("Enter the number of elements : ")
        val n = sc.nextInt()
        val arr = IntArray(n)
        System.out.println("Enter $n elements :")
        for (i in 0 until n)
            arr[i] = sc.nextInt()

        bubbleSort(arr)

        System.out.println("\nThe sorted array : ;")
        for (i in 0 until n)
            System.out.print(arr[i].toString() + " ")
        System.out.println()
    }

    internal fun bubbleSort(arr: IntArray) {
        val len = arr.size
        var tmp: Int
        var flag: Boolean
        for (i in 0 until len) {
            flag = false
            for (j in 0 until len - i - 1) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = tmp
                    flag = true
                }
            }
            if (!flag)
                break
        }
    }
}
