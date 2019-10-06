internal class CountingSort {
    fun sort(arr: CharArray) {
        val n = arr.size

        // The output character array that will have sorted arr
        val output = CharArray(n)

        // Create a count array to store count of inidividual
        // characters and initialize count array as 0
        val count = IntArray(256)
        for (i in 0..255)
            count[i] = 0

        // store count of each character
        for (i in 0 until n)
            ++count[arr[i]]

        // Change count[i] so that count[i] now contains actual
        // position of this character in output array
        for (i in 1..255)
            count[i] += count[i - 1]

        // Build the output character array
        // To make it stable we are operating in reverse order.
        for (i in n - 1 downTo 0) {
            output[count[arr[i]] - 1] = arr[i]
            --count[arr[i]]
        }

        // Copy the output array to arr, so that arr now
        // contains sorted characters
        for (i in 0 until n)
            arr[i] = output[i]
    }

    companion object {

        // Driver method
        fun main(args: Array<String>) {
            val ob = CountingSort()
            val arr = charArrayOf('c', 'o', 'u', 'n', 't', 'i', 'n', 'g', 's', 'o', 'r', 't')

            ob.sort(arr)

            System.out.print("Sorted character array is ")
            for (i in arr.indices)
                System.out.print(arr[i])
        }
    }
}