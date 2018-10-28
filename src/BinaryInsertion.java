/**
 * Binary Insertion Sort where we sort using insertion ad binary.
 */
public class BinaryInsertion {
    /**
     * This class should not be instantiated.
     */
    private BinaryInsertion() { }

    /**
     * Rearranges the array in ascending order, using the natural order.
     * @param a the array to be sorted
     */
    public static void sort(final Comparable[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {

            // binary search to determine index j at which to insert a[i]
            Comparable v = a[i];
            int lo = 0, hi = i;
            while (lo < hi) {
                int mid = lo + (hi - lo) / 2; 
                if (less(v, a[mid])) hi = mid;
                else                 lo = mid + 1;
            }

            // insetion sort with "half exchanges"
            // (insert a[i] at index j and shift a[j], ..., a[i-1] to right)
            for (int j = i; j > lo; --j)
                a[j] = a[j-1];
            a[lo] = v;
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
    private static boolean less(final Comparable v, final Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * print array to standard output
     *
     * @param      a     The array.
     */
    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

