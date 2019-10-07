/**
 *  this is the Optimized insertion sort.
 *  Sorts a sequence  of standard input using an optimized
 *  version of insertion sort that uses half exchanges instead of 
 *  full exchanges to reduce data movement.
 */
import java.util.Scanner;

/**
 * Class for insertion x.
 */
public class InsertionOpt {

    /**
     * Constructs the object.
     */
    private InsertionOpt() {
        //unused Constructor.
    }
    /**
     * The given array is arranged ihn ascending order.
     * Time complexity of this function is O(N)
     *
     * @param      a     This is the Array that is to be sorted.
     */
    public static void sort(Comparable[] a) {
        int n = a.length;

        /**
         * the smallest element is choosen so that it acts as the Guard and
         * makes sure the index doesnt go beyond.
         */

        int exchanges = 0;
        for (int i = n - 1; i > 0; i--) {
            if (less(a[i], a[i - 1])) {
                swap(a, i, i - 1);
                exchanges++;
            }
        }
        if (exchanges == 0) return;
        
        /**
         * the insertion sort is done with half number of exchanges.
         */
        for (int i = 2; i < n; i++) {
            Comparable v = a[i];
            int j = i;
            while (less(v, a[j - 1])) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = v;
        }

        assert isSorted(a);
    }

    /**
     * this is the helper funciton for the code.
     *
     * @param      v     object 1 to be compared.
     * @param      w     object 2 to be compared.
     *
     * @return     returns true if v is smaller to w
     *             and false if v is greater to w.
     */
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * This function is used to swap two elements.
     * 
     *
     * @param      a     Object array
     * @param      i     index of element1.
     * @param      j     index of element2.
     */
    private static void swap(Object[] a, int i, int j) {
        Object swp = a[i];
        a[i] = a[j];
        a[j] = swp;
    }


    /**
     * this function is used to check if the Array is Sorted or not.
     * 
     *
     * @param      a     this is the array that we need to check
     *                   whether the array is sorted or not
     *
     * @return     True if sorted, False otherwise.
     */
    private static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i - 1])) return false;
        return true;
    }

    /**
     * this is to print the Array.
     *
     * @param      a     this is the array that we wish to print.
     */
    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] a = scan.nextLine().split(" ");
        InsertionOpt.sort(a);
        show(a);
    }

}
