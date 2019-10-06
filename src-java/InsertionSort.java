// to compile: javac InsertionSort.java
// to run: java InsertionSort
public class InsertionSort {

  	public static void sort(final int array[]){
	      for(int i=1; i<array.length; i++){
		  	    int value = array[i];
			      int j = i - 1;

			      while(j >= 0 && array[j] > value){
				        int tmp = array[j];
				        array[j] = array[j+1];
				        array[j+1] = tmp;
				        j--;
			      }
			      array[j+1] = value;

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
