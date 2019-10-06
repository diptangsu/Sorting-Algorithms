import java.util.Arrays
import java.util.Random

class TimSort {

    fun main(args: Array<String>) {
        System.out.println("Sorting of randomly generated numbers using TIM SORT")
        val random = Random()
        val N = 20
        val sequence = IntArray(N)

        for (i in 0 until N)
            sequence[i] = Math.abs(random.nextInt(100))

        System.out.println("\nOriginal Sequence: ")
        printSequence(sequence)

        System.out.println("\nSorted Sequence: ")
        Arrays.sort(sequence) // as TimSort is used by Java for sorting arrays since Java 7
        printSequence(sequence)
    }

    private fun printSequence(sortedSequence: IntArray) {
        for (aSortedSequence in sortedSequence) System.out.print("$aSortedSequence ")
    }
}
