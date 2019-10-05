/**
 * Binary Insertion Sort where we sort using insertion ad binary.
 */
class BinaryInsertion {

    /**
     * Rearranges the array in ascending order, using the natural order.
     * @param a the array to be sorted
     */
    fun sort(a: Array<Comparable>) {
        val n = a.size
        for (i in 1 until n) {

            // binary search to determine index j at which to insert a[i]
            val v = a[i]
            var lo = 0
            var hi = i
            while (lo < hi) {
                val mid = lo + (hi - lo) / 2
                if (less(v, a[mid]))
                    hi = mid
                else
                    lo = mid + 1
            }

            // insetion sort with "half exchanges"
            // (insert a[i] at index j and shift a[j], ..., a[i-1] to right)
            for (j in i downTo lo + 1)
                a[j] = a[j - 1]
            a[lo] = v
        }
    }

    /**
     * first element is less than second element.
     *
     * @param      v     first element.
     * @param      w     second element.
     *
     * @return     return true or false.
     */
    private fun less(v: Comparable, w: Comparable): Boolean {
        return v.compareTo(w) < 0
    }

    /**
     * print array to standard output
     *
     * @param      a     The array.
     */
    private fun show(a: Array<Comparable>) {
        for (i in a.indices) {
            System.out.println(a[i])
        }
    }
}
/**
 * This class should not be instantiated.
 */

