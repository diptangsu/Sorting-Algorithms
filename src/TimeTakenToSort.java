import java.util.Arrays;

public class TimeTakenToSort {
    public static void main(String args[]) {
        int size = 6000;
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }

        System.out.println("Array length = " + size);
        System.out.println("\nElements randomly distributed : ");
        System.out.println("Sorting Algorithm\tTime Taken(ns)");
        printTimesTaken(arr, size);

        System.out.println("\nElements already sorted : ");
        System.out.println("Sorting Algorithm\tTime Taken(ns)");
        Arrays.sort(arr);
        printTimesTaken(arr, size);

        System.out.println("\nElements sorted in reverse order : ");
        System.out.println("Sorting Algorithm\tTime Taken(ns)");
        for (int i = 0; i <= arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size - i - 1] = t;
        }
        printTimesTaken(arr, size);
    }

    private static void printTimesTaken(int arr[], int size) {
        long startTime, endTime, duration;
        int arr2[] = new int[size];
        System.arraycopy(arr, 0, arr2, 0, size);
        startTime = System.nanoTime();
        BubbleSort.bubbleSort(arr2);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Bubble Sort\t\t\t" + duration);

        System.arraycopy(arr, 0, arr2, 0, size);
        startTime = System.nanoTime();
        SelectionSort.selectionSort(arr2);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Selection Sort\t\t" + duration);

        System.arraycopy(arr, 0, arr2, 0, size);
        startTime = System.nanoTime();
        InsertionSort.insertionSort(arr2);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Insertion Sort\t\t" + duration);

        System.arraycopy(arr, 0, arr2, 0, size);
        startTime = System.nanoTime();
        QuickSort.quickSort(arr2, 0, size - 1);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Quick Sort\t\t\t" + duration);

        System.arraycopy(arr, 0, arr2, 0, size);
        startTime = System.nanoTime();
        HeapSort.heapSort(arr2);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Heap Sort\t\t\t" + duration);

        System.arraycopy(arr, 0, arr2, 0, size);
        startTime = System.nanoTime();
        MergeSort.mergeSort(arr2, 0, size - 1);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Merge Sort\t\t\t" + duration);

        System.arraycopy(arr, 0, arr2, 0, size);
        startTime = System.nanoTime();
        CycleSort.cycleSort(arr2, 0, size - 1);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Cycle Sort\t\t\t" + duration);
      
        System.arraycopy(arr, 0, arr2, 0, size);
        startTime = System.nanoTime();
        ShellSort.shellSort(arr2);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Shell Sort\t\t\t" + duration);
    }
}
