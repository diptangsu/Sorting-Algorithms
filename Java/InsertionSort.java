import java.util.Scanner;

public class InsertionSort {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements :");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        insertionSort(arr);

        System.out.println("\nThe sorted array : ;");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void insertionSort(int arr[]) {
        int len = arr.length, tmp, j;
        for (int i = 1; i < len; i++) {
            tmp = arr[i];
            for (j = i; j > 0; j--) {
                if (arr[j - 1] > tmp)
                    arr[j] = arr[j - 1];
                else
                    break;
            }
            arr[j] = tmp;
        }
    }
}
