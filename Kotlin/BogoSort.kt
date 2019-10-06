import java.util.Scanner

//The infamous worst sorting algorithm of all. BogoSort is entirely based on randomly generating a permutation of
//the list that just happens to be sorted. Otherwise, it keeps generating random permutations of the elements in the
//the array. This particular implementation actually prints the total amount of shuffles it goes through before the
//sorted array permutation was actually generated.
class BogoSort {

    //Main method adapted from uploaded files by OP.
    fun main(args: Array<String>) {
        //Read number of elements and the elements using a Scanner Instance.
        val sc = Scanner(System.`in`)
        System.out.print("Enter the number of elements : ")
        val n = sc.nextInt()
        val arr = IntArray(n)
        System.out.println("Enter $n elements :")
        for (i in 0 until n)
            arr[i] = sc.nextInt()

        //Call RandomSort.
        RandomSort(arr)

        //Print array after sorting.
        System.out.println("\nThe sorted array : ;")
        for (i in 0 until n)
            System.out.print(arr[i].toString() + " ")
        System.out.println()
    }

    //Sorting method calls shuffle while calling isSorted to check if it is
    //sorted. It will repeatedly call shuffle until isSorted returns true.
    internal fun RandomSort(i: IntArray) {
        var counter = 0
        while (!isSorted(i)) {
            shuffle(i)
            counter++
        }
        System.out.println("The array was shuffled $counter times!")
    }

    //Shuffles the array that is passed to it by randomly swapping
    //elements within the array.
    internal fun shuffle(i: IntArray) {
        //iterate through all elements
        for (x in i.indices) {
            //2 indexes are randomly generated using random * integer array length.
            val index1 = (Math.random() * i.size) as Int
            val index2 = (Math.random() * i.size) as Int

            //Swap the elements in the two randomly generated indexes.
            val a = i[index1]
            i[index1] = i[index2]
            i[index2] = a
        }
    }

    //Checks the array is sorted by checking if each consecutive term is increasing in magnitude.
    internal fun isSorted(i: IntArray): Boolean {
        for (x in 0 until i.size - 1) {
            if (i[x] > i[x + 1]) {
                return false
            }
        }
        return true
    }
}