import java.util.Scanner;

public class coba {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BUBBLE SORT");
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements :");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print("Before sorted array : ");
        for(int x = 0; x < n; x++)
            System.out.print(arr[x]+" ");
        bubbleSort(arr);
        System.out.print("\nAfter sorted array : ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void bubbleSort(int arr[]) {
        int len = arr.length, tmp;
        boolean flag;
        for (int i = 0; i < len; i++) {
            flag = false;
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = true;
                }
            }
            if (!flag)
                break;
        }
    }
}
