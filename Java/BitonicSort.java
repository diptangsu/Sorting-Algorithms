import java.util.Scanner;

public class BitonicSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements :");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		bitonicSort(arr, 0, arr.length, 1);

		System.out.println("\nThe sorted array : ;");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	/**
	 * This is the Sorting function that iteratively sorts the array
	 * @param arr 		 The array/sub-array to be sorted
	 * @param start 	 Starting Index to condider for sorting
	 * @param length	 Length of array to sort
	 * @param direction  Directrion of sorting: 1 for ascending order sort and 0 for descending order
	 */
	public static void bitonicSort(int[] arr, int start, int length, int direction) {
		if (length > 1) {
			int mid = length/2;

			bitonicSort(arr, start, mid, 1);

			bitonicSort(arr, start+mid, mid, 0);

			bitonicMerge(arr, start, length, direction);
		}
	}

	/**
	 * This function merges the two halves of array in bitonic order
	 * @param arr 		 The array/sub-array to be sorted
	 * @param start 	 Starting Index to condider for sorting
	 * @param length	 Length of array to sort
	 * @param direction  Directrion of sorting: 1 for ascending order sort and 0 for descending order
	 */
	private static void bitonicMerge(int[] arr, int start, int length, int direction) {
		if (length > 1) {
			int mid = length/2;

			for (int i = start; i < start+mid; i++) {
				if ((arr[i] > arr[i+mid] && direction == 1) ||
					 (arr[i] < arr[i+mid] && direction == 0)) {
					int temp = arr[i];
					arr[i] = arr[i+mid];
					arr[i+mid] = temp;
				}
			}

			bitonicMerge(arr, start, mid, direction);

			bitonicMerge(arr, start+mid, mid, direction);
		}
	}

}
