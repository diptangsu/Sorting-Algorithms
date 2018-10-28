import java.util.Random;

/*
    Gnome Sort is based on the technique used by the standard Dutch Garden Gnome (Du.: tuinkabouter).
    Here is how a garden gnome sorts a line of flower pots.
    Basically, he looks at the flower pot next to him and the previous one; if they are in the right order he steps one pot forward, otherwise, he swaps them and steps one pot backward.
    Boundary conditions: if there is no previous pot, he steps forwards; if there is no pot next to him, he is done.
    — "Gnome Sort - The Simplest Sort Algorithm". Dickgrune.com
 */
public class GnomeSort {

    public static void main(String args[])
    {
        System.out.println("Sorting of randomly generated numbers using GNOME SORT");
        Random random = new Random();
        int N = 20;
        int[] sequence = new int[N];

        for (int i = 0; i < N; i++)
            sequence[i] = Math.abs(random.nextInt(100));

        System.out.println("\nOriginal Sequence: ");
        printSequence(sequence);

        System.out.println("\nSorted Sequence: ");
        printSequence(gnomeSort(sequence));
    }

    static void printSequence(int[] sortedSequence)
    {
        for (int i = 0; i < sortedSequence.length; i++)
            System.out.print(sortedSequence[i] + " ");
    }

    public static int[] gnomeSort(int arr[]){
        int first = 1;

        while(first < arr.length)
        {
            if (arr[first-1] <= arr[first])
            {
                first++;
            }
            else
            {
                int tmp = arr[first-1];
                arr[first - 1] = arr[first];
                arr[first] = tmp;
                if (-- first == 0)
                {
                    first = 1;
                }
            }
        }
        return arr;
    }
}
