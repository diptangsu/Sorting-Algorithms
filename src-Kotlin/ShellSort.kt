import java.util.Scanner

class ShellSort {
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        System.out.print("Enter the number of elements : ")
        val n = sc.nextInt()
        val arr = IntArray(n)
        System.out.println("Enter $n elements :")
        for (i in 0 until n)
            arr[i] = sc.nextInt()

        shellSort(arr)

        System.out.println("\nThe sorted array : ;")
        for (i in 0 until n)
            System.out.print(arr[i].toString() + " ")
        System.out.println()
    }

    internal fun shellSort(nums: IntArray) {
        var h = 1
        val n = nums.size
        while (h < n) {
            h = h * 3 + 1
        }
        h = h / 3
        var c: Int
        var j: Int

        while (h > 0) {
            for (i in h until n) {
                c = nums[i]
                j = i
                while (j >= h && nums[j - h] > c) {
                    nums[j] = nums[j - h]
                    j = j - h
                }
                nums[j] = c
            }
            h = h / 2
        }
    }
}
