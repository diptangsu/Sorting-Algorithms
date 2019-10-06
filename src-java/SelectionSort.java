// to compile: javac SelectionSort.java
// to run: java SelectionSort
public class SelectionSort {

    public static void sort(final int array[]) {
		    for(int i = 0; i < array.length; i++) {
			      int min = i;
			      for(int j = i+1; j < array.length; j++) {
				        if(array[j] < array[min]) {
					          min = j;
				        }
			      }
			      int tmp = array[i];
			      array[i] = array[min];
			      array[min] = tmp;
        }
    }

    public static void main(String []args) {
        int arr[] = new int[]{12, 76, 0, 21, -1, 201, 3, 13};
        sort(arr);

        for(int i = 1; i < arr.length; i++) {
            if(arr[i-1] > arr[i]) {
                System.out.println("wrong: " + arr[i-1] +" before "+ arr[i]);
            }
        }
        System.out.println("Sorted correctly");
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
