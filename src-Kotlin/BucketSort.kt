import java.util.ArrayList
import java.util.Arrays
import java.util.Collections
import java.util.Random

class BucketSort {
    fun bucketSort(sequence: IntArray, maxValue: Int): IntArray {
        // Bucket Sort
        val Bucket = IntArray(maxValue + 1)
        val sortedSequence = IntArray(sequence.size)

        for (i in sequence.indices)
            Bucket[sequence[i]]++

        var outPos = 0
        for (i in Bucket.indices)
            for (j in 0 until Bucket[i])
                sortedSequence[outPos++] = i

        return sortedSequence
    }

    fun printSequence(sortedSequence: IntArray) {
        for (i in sortedSequence.indices)
            System.out.print(sortedSequence[i].toString() + " ")
    }

    fun maxValue(sequence: IntArray): Int {
        var maxValue = 0
        for (i in sequence.indices)
            if (sequence[i] > maxValue)
                maxValue = sequence[i]
        return maxValue
    }

    fun main(args: Array<String>) {
        System.out.println("Sorting of randomly generated numbers using BUCKET SORT")
        val random = Random()
        val N = 20
        val sequence = IntArray(N)

        for (i in 0 until N)
            sequence[i] = Math.abs(random.nextInt(100))

        val maxValue = maxValue(sequence)

        System.out.println("\nOriginal Sequence: ")
        printSequence(sequence)

        System.out.println("\nSorted Sequence: ")
        printSequence(bucketSort(sequence, maxValue))
    }

}
