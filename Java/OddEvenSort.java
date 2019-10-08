import java.util.Scanner;

public class OddEvenSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements :");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        oddEvenSort(arr);

        System.out.println("\nThe sorted array : ;");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void oddEvenSort(int array[]) {
      boolean sorted = false;
      while (!sorted) {
          sorted = true;
          for (int i = 1; i < array.length - 1; i += 2) {
               if (array[ i ] > array[ i + 1 ]) {
                    swap( array , i , i + 1 );
                    sorted = false;
               }
          }

          for (int i = 0; i < array.length - 1; i += 2) {
               if (array[ i ] > array[ i + 1 ]) {
                    swap( array , i , i + 1 );
                    sorted = false;
               }
          }
     }
}

    private static void swap(int[] array, int i, int j) {
     int temp;
     temp = array[ i ];
     array[ i ] = array[ j ];
     array[ j ] = temp;
}
}
