import java.util.Arrays

class AlgorithmComparison {
    fun main(args: Array<String>) {

        val size = 6000
        val arr = IntArray(size)
        for (i in 0 until size) {
            arr[i] = (Math.random() * 1000) as Int
        }

        System.out.println("Array length = $size")
        System.out.println("\nElements randomly distributed : ")
        System.out.println("\nSorting Algorithm\tTime Taken(ns)")
        compareSortingAlgorithms(arr)

        System.out.println("\nElements already sorted : ")
        System.out.println("\nSorting Algorithm\tTime Taken(ns)")
        Arrays.sort(arr)
        compareSortingAlgorithms(arr)

        System.out.println("\nElements sorted in reverse order : ")
        System.out.println("\nSorting Algorithm\tTime Taken(ns)")
        for (i in 0..arr.size / 2) {
            val t = arr[i]
            arr[i] = arr[size - i - 1]
            arr[size - i - 1] = t
        }
        compareSortingAlgorithms(arr)
    }

    private fun compareSortingAlgorithms(arr: IntArray) {

        printSortingTime(SortType.BUBBLE, arr)
        printSortingTime(SortType.COMB, arr)
        printSortingTime(SortType.HEAP, arr)
        printSortingTime(SortType.INSERTION, arr)
        printSortingTime(SortType.MERGE, arr)
        printSortingTime(SortType.QUICK, arr)
        printSortingTime(SortType.SELECTION, arr)
        printSortingTime(SortType.CYCLE, arr)
        printSortingTime(SortType.SHELL, arr)
        printSortingTime(SortType.INTRO, arr)
        printSortingTime(SortType.GNOME, arr)
    }

    private fun printSortingTime(sortType: SortType, arr: IntArray) {

        val arr2 = IntArray(arr.size)
        System.arraycopy(arr, 0, arr2, 0, arr.size)

        val startTime = System.nanoTime()

        when (sortType) {
            BUBBLE -> BubbleSort.bubbleSort(arr2)
            COMB -> CombSort.combSort(arr2)
            HEAP -> HeapSort.heapSort(arr2)
            INSERTION -> InsertionSort.insertionSort(arr2)
            MERGE -> MergeSort.mergeSort(arr2, 0, arr2.size - 1)
            QUICK -> QuickSort.quickSort(arr2, 0, arr2.size - 1)
            SELECTION -> SelectionSort.selectionSort(arr2)
            CYCLE -> CycleSort.cycleSort(arr2, 0)
            SHELL -> ShellSort.shellSort(arr2)
            INTRO -> {
                IntroSort.introSort(arr2, 0, arr2.size - 1, IntroSort.calcDepth(arr2))
                GnomeSort.gnomeSort(arr2)
            }
            GNOME -> GnomeSort.gnomeSort(arr2)
        }

        val endTime = System.nanoTime()
        val duration = endTime - startTime

        System.out.printf("%-17s %15d %n", sortType + "_SORT", duration)
    }
}
