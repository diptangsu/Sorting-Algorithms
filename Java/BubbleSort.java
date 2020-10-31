import java.util.Scanner;

public class BubbleSort {	
	
	static void bubbleSortAsc(int arr[], int n) {
		int tmp;
		boolean flag;

		for (int i = 0; i < n - 1; i++) {
			flag = false;
			for (int j = 0; j < n - i - 1; j++) {
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
	
	static void bubbleSortDesc(int arr[], int n) {
		int tmp;
		boolean flag;

		for (int i = 0; i < n - 1; i++) {
			flag = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
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
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);		
		System.out.print("Indicate the number of elements: ");
		int order;
		boolean asc;
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Type " + n + " numbers: ");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("Indicate desired order (0 for Ascending, 1 for Descending):");
		order = sc.nextInt();
		asc = order == 0 ? true : false;	
		if (asc)
			bubbleSortAsc(arr, arr.length);
		else
			bubbleSortDesc(arr, arr.length);
		System.out.println("The sorted array : ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		sc.close();
	}
}
