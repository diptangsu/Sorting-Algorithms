import java.util.Scanner

class CombSort {

    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        System.out.print("Enter the number of elements : ")
        val n = sc.nextInt()
        val arr = IntArray(n)
        System.out.println("Enter $n elements :")
        for (i in 0 until n)
            arr[i] = sc.nextInt()

        combSort(arr)

        System.out.println("\nThe sorted array : ;")
        for (i in 0 until n)
            System.out.print(arr[i].toString() + " ")
        System.out.println()
    }

    internal fun combSort(arr: IntArray) {
        val n = arr.size

        // initialize gap
        var gap = n

        // Initialize swapped as true to make sure that
        // loop runs
        var swapped = true

        // Keep running while gap is more than 1 and last
        // iteration caused a swap
        while (gap != 1 || swapped == true) {
            // Find next gap
            gap = getNextGap(gap)

            // Initialize swapped as false so that we can
            // check if swap happened or not
            swapped = false

            // Compare all elements with current gap
            for (i in 0 until n - gap) {
                if (arr[i] > arr[i + gap]) {
                    // Swap arr[i] and arr[i+gap]
                    val temp = arr[i]
                    arr[i] = arr[i + gap]
                    arr[i + gap] = temp

                    // Set swapped
                    swapped = true
                }
            }
        }
    }

    // To find gap between elements
    internal fun getNextGap(gap: Int): Int {
        var gap = gap
        // Shrink gap by Shrink factor
        gap = gap * 10 / 13
        return if (gap < 1) 1 else gap
    }
}
