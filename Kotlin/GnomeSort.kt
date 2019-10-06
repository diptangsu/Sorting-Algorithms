import java.util.Random

/*
    Gnome Sort is based on the technique used by the standard Dutch Garden Gnome (Du.: tuinkabouter).
    Here is how a garden gnome sorts a line of flower pots.
    Basically, he looks at the flower pot next to him and the previous one; if they are in the right order he steps one pot forward, otherwise, he swaps them and steps one pot backward.
    Boundary conditions: if there is no previous pot, he steps forwards; if there is no pot next to him, he is done.
    — "Gnome Sort - The Simplest Sort Algorithm". Dickgrune.com
 */
class GnomeSort {

    fun main(args: Array<String>) {
        System.out.println("Sorting of randomly generated numbers using GNOME SORT")
        val random = Random()
        val N = 20
        val sequence = IntArray(N)

        for (i in 0 until N)
            sequence[i] = Math.abs(random.nextInt(100))

        System.out.println("\nOriginal Sequence: ")
        printSequence(sequence)

        System.out.println("\nSorted Sequence: ")
        printSequence(gnomeSort(sequence))
    }

    internal fun printSequence(sortedSequence: IntArray) {
        for (i in sortedSequence.indices)
            System.out.print(sortedSequence[i].toString() + " ")
    }

    fun gnomeSort(arr: IntArray): IntArray {
        var first = 1

        while (first < arr.size) {
            if (arr[first - 1] <= arr[first]) {
                first++
            } else {
                val tmp = arr[first - 1]
                arr[first - 1] = arr[first]
                arr[first] = tmp
                if (--first == 0) {
                    first = 1
                }
            }
        }
        return arr
    }
}
