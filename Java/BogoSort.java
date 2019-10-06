import java.util.Scanner;

//The infamous worst sorting algorithm of all. BogoSort is entirely based on randomly generating a permutation of
//the list that just happens to be sorted. Otherwise, it keeps generating random permutations of the elements in the
//the array. This particular implementation actually prints the total amount of shuffles it goes through before the
//sorted array permutation was actually generated.
public class BogoSort {

    //Main method adapted from uploaded files by OP.
    public static void main(String args[]) {
        //Read number of elements and the elements using a Scanner Instance.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements :");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        //Call RandomSort.
        RandomSort(arr);

        //Print array after sorting.
        System.out.println("\nThe sorted array : ;");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    //Sorting method calls shuffle while calling isSorted to check if it is
    //sorted. It will repeatedly call shuffle until isSorted returns true.
    static void RandomSort(int[] i) {
        int counter = 0;
        while(!isSorted(i)) {
            shuffle(i);
            counter++;
        }
        System.out.println("The array was shuffled "+counter+" times!");
    }

    //Shuffles the array that is passed to it by randomly swapping
    //elements within the array.
    static void shuffle(int[] i) {
        //iterate through all elements
        for(int x = 0; x < i.length; ++x) {
            //2 indexes are randomly generated using random * integer array length.
            int index1 = (int) (Math.random() * i.length);
            int index2 = (int) (Math.random() * i.length);

            //Swap the elements in the two randomly generated indexes.
            int a = i[index1];
            i[index1] = i[index2];
            i[index2] = a;
        }
    }

    //Checks the array is sorted by checking if each consecutive term is increasing in magnitude.
    static boolean isSorted(int[] i) {
        for(int x = 0; x < i.length - 1; ++x) {
            if(i[x] > i[x+1]) {
                return false;
            }
        }
        return true;
    }
}