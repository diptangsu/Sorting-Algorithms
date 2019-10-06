import java.util.Random;
import java.util.Scanner;

public class IntroSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter " + n + " elements :");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		introSort(arr, 0, n - 1, calcDepth(arr));

		System.out.println("\nThe sorted array : ;");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

	}

	/**
	 * 
	 * @param arr
	 *            The array of elements
	 * @param low
	 *            The lowest array index to sort
	 * @param high
	 *            The highest array index to sort
	 * @param depth
	 *            The maximum recursion depth
	 */
	static void introSort(int arr[], int low, int high, int depth) {
		int p = partition(arr, low, high);
		if ((high - low) < 2) {
			return;
		} else if (p > depth) {
			HeapSort.heapSort(arr);
		} else {
			introSort(arr, low, p, depth - 1);
			introSort(arr, p + 1, high, depth - 1);
		}
	}

	/**
	 * 
	 * @param arr
	 *            The array of elements
	 * @param low
	 *            The lowest array index to sort
	 * @param high
	 *            The highest array index to sort
	 * @return The pivot index
	 */
	private static int partition(int arr[], int low, int high) {
		int p = getPivot(arr, low, high), j = low;

		for (int i = low; i <= high; i++) {
			if (arr[i] < p) {
				swap(arr, i, j);
				j++;
			}
		}
		swap(arr, high, j);

		return j;
	}

	/**
	 * 
	 * @param arr
	 *            The array of elements
	 * @param low
	 *            The lowest array index to sort
	 * @param high
	 *            The highest array index to sort
	 * @return A pivot index
	 */
	private static int getPivot(int arr[], int low, int high) {
		Random rd = new Random();
		return arr[rd.nextInt((high - low) + 1) + low];
	}
	

	/**
	 * 
	 * @param arr
	 *            The array of elements for swap
	 * @param x
	 *            One of the element for swap
	 * @param y
	 *            Another element to swap
	 */
	private static void swap(int arr[], int x, int y) {
		int aux = arr[x];
		arr[x] = arr[y];
		arr[y] = aux;
	}

	/**
	 * 
	 * @param arr
	 *            The array of elements
	 * @return The maximum recursion depth of array
	 */
	static int calcDepth(int arr[]) {
		return ((int) Math.log(arr.length)) * 2;
	}
}
