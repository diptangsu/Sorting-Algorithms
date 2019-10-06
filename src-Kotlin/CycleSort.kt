class CycleSort {
    // Main function to test the Cycle sort function
    fun main(args: Array<String>) {
        val arr = intArrayOf(1, 8, 3, 9, 10, 10, 2, 4)
        val n = arr.size
        cycleSort(arr, n)

        System.out.println("After sort: ")
        for (i in 0 until n) {
            System.out.println(arr[i].toString() + " ")
        }
    }

    // Function sort the array using Cycle sort
    fun cycleSort(arr: IntArray, n: Int) {
        var w = 0 // count number of memory writes

        for (start in 0..n - 2) {
            var item = arr[start] // initializing the starting point

            var pos = start // find the position where we put the item
            for (i in start + 1 until n)
                if (arr[i] < item)
                    pos++

            if (pos == start)
            // if the item is already in the correct position
                continue

            while (item == arr[pos])
            // ignore all duplicate elements
                pos += 1

            if (pos != start) { // put the item to it's right position
                val temp = item
                item = arr[pos]
                arr[pos] = temp
                w++
            }

            while (pos != start) { // rotate rest of the cycle
                pos = start

                for (i in start + 1 until n)
                    if (arr[i] < item)
                        pos += 1

                while (item == arr[pos])
                    pos += 1

                if (item != arr[pos]) {
                    val temp = item
                    item = arr[pos]
                    arr[pos] = temp
                    w++
                }
            }
        }
    }
}