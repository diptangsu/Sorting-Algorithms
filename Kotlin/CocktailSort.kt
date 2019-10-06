class CocktailSort {
    internal fun cocktailSort(array: IntArray) {
        var swapped = true
        var start = 0
        var end = array.size

        while (swapped == true) {
            swapped = false

            for (i in start until end - 1) {
                if (array[i] > array[i + 1]) {
                    val temp = array[i]
                    array[i] = array[i + 1]
                    array[i + 1] = temp
                    swapped = true
                }
            }

            if (swapped == false)
                break

            swapped = false
            end = end - 1

            for (i in end - 1 downTo start) {
                if (array[i] > array[i + 1]) {
                    val temp = array[i]
                    array[i] = array[i + 1]
                    array[i + 1] = temp
                    swapped = true
                }
            }

            start = start + 1
        }
    }

    companion object {

        fun main(args: Array<String>) {
            val cs = CocktailSort()
            val array = intArrayOf(5, 8, 3, 6, 4, 9, 1, 7, 2)
            cs.cocktailSort(array)
            System.out.println("Sorted array :")

            for (i in array.indices) {
                System.out.println(array[i].toString() + " ")
            }
        }
    }
}
