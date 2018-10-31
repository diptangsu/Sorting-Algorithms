public class CycleSort {
    // Main function to test the Cycle sort function
    public static void main(String[] args) {
        int arr[] = {1, 8, 3, 9, 10, 10, 2, 4};
        int n = arr.length;
        cycleSort(arr, n);

        System.out.println("After sort: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    // Function sort the array using Cycle sort
    public static void cycleSort(int arr[], int n) {
        int w = 0; // count number of memory writes

        for (int start = 0; start <= n - 2; start++) {
            int item = arr[start]; // initializing the starting point

            int pos = start; // find the position where we put the item
            for (int i = start + 1; i < n; i++)
                if (arr[i] < item)
                    pos++;

            if (pos == start) // if the item is already in the correct position
                continue;

            while (item == arr[pos]) // ignore all duplicate elements
                pos += 1;

            if (pos != start) { // put the item to it's right position
                int temp = item;
                item = arr[pos];
                arr[pos] = temp;
                w++;
            }

            while (pos != start) { // rotate rest of the cycle
                pos = start;

                for (int i = start + 1; i < n; i++)
                    if (arr[i] < item)
                        pos += 1;

                while (item == arr[pos])
                    pos += 1;

                if (item != arr[pos]) {
                    int temp = item;
                    item = arr[pos];
                    arr[pos] = temp;
                    w++;
                }
            }
        }
    }
}