import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements :");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        mergeSort(arr, 0, n - 1);
        System.out.println("\nThe sorted array : ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private static void mergeSort(int arr[], int lower, int upper) {
        if (lower >= upper)
            return;
        int m = (lower + upper) / 2;
        mergeSort(arr, lower, m);
        mergeSort(arr, m + 1, upper);
        merge(arr, lower, upper);
    }

    private static void merge(int arr[], int lower, int upper) {
        int m = (lower + upper) / 2;
        int a[] = new int[upper - lower + 1];
        int k, i, j;
        k = 0;
        i = lower;
        j = m + 1;
        for (; i <= m && j <= upper; ) {
            if (arr[i] < arr[j]) {
                a[k++] = arr[i];
                i++;
            } else {
                a[k++] = arr[j];
                j++;
            }
        }
        for (; i <= m; i++)
            a[k++] = arr[i];
        for (; j <= upper; j++)
            a[k++] = arr[j];
        k = 0;
        for (i = lower; i <= upper; i++)
            arr[i] = a[k++];
    }
}