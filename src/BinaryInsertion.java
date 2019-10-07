import java.util.Scanner;

/**
 *  The Binary Insertion class provides a static method for sorting an
 *  array using an optimized binary insertion sort with half exchanges.
 *
 *  The sorting algorithm is stable.
 */


public class BinaryInsertion {

    /**
     * Constructs the object.
     */
    private BinaryInsertion() {

        /**
         * unused constructor.
         */
    }

    /**
     * this function is used to sort the given array.
     *
     * @param      a     this is the array that is to be sorted
     */
    public static void sort(Comparable[] a) {
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
                a[j] = a[j - 1];
            a[lo] = v;
        }
        assert isSorted(a);
    }



    /**
     * this function is used to compare between two elemnts.
     * 
     * @param      v     this is the element 1 to compare.
     * @param      w     this is the element 2 to compare.
     *
     * @return     return true if v is less than w.
     */
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * this function is used to check whether the
     * array is sorted or not
     *
     * @param      a     array that is to be checked.
     *
     * @return     True if sorted, False otherwise.
     */
    private static boolean isSorted(Comparable[] a) {
        return isSorted(a, 0, a.length - 1);
    }

    /**
     * Determines if sorted between the lo and high.
     *
     * @param      a     this is the array that is to be sorted.
     * @param      lo    The lower
     * @param      hi    The higher
     *
     * @return     True if sorted, False otherwise.
     */
    private static boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(a[i], a[i - 1])) return false;
        return true;
    }

    /**
     * this is used to display the array on the console.
     *
     * @param      a     array that is to be displayed.
     */
    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    /**
     * this is to handle the input and output from the console.
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] a = scan.nextLine().split(" ");
        BinaryInsertion.sort(a);
        show(a);
    }
}