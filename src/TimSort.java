import java.util.Arrays;
import java.util.Random;

public class TimSort {

    public static void main(String args[])
    {
        System.out.println("Sorting of randomly generated numbers using TIM SORT");
        Random random = new Random();
        int N = 20;
        int[] sequence = new int[N];

        for (int i = 0; i < N; i++)
            sequence[i] = Math.abs(random.nextInt(100));

        System.out.println("\nOriginal Sequence: ");
        printSequence(sequence);

        System.out.println("\nSorted Sequence: ");
        Arrays.sort(sequence); // as TimSort is used by Java for sorting arrays since Java 7
        printSequence(sequence);
    }

    private static void printSequence(int[] sortedSequence)
    {
        for (int aSortedSequence : sortedSequence) System.out.print(aSortedSequence + " ");
    }
}
