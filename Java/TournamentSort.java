import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

class TournamentSort<T> {
    T[] array;
    private Comparator<T> comparator;
    private int[] matches;
    private int tourney;

    private TournamentSort(Comparator<T> comparator, T[] v) {
        this.array = v;
        this.matches = new int[6 * v.length];
        this.comparator = comparator;
        this.tourney = knockout(0, v.length - 1, 3);
    }

    public static <T> void sort(T[] v, Comparator<T> comparator) {
        TournamentSort<T> tourney = new TournamentSort<>(comparator, v);
        ArrayList<T> copy = new ArrayList<>(v.length);
        for (T ignored : v) copy.add(tourney.pop());
        copy.toArray(v);
    }

    private static Integer[] randomInts(int n) {
        Random r = new Random(12345678);
        Integer[] v = new Integer[n];
        for (int i = 0; i < n; i++)
            v[i] = r.nextInt(10 * n);
        return v;
    }

    private static void time(String description, Runnable action, InstrumentedCompare compare) {
        long start = System.currentTimeMillis();
        action.run();
        long finish = System.currentTimeMillis();
        System.out.println(description + " took " + ((double) (finish - start) / 1000.0) + " secs " + compare.count + " comparisons");
    }

    public static void main(String[] args) {
        int n = args.length >= 1 ? Integer.parseInt(args[0]) : 100000;
        final InstrumentedCompare tournamentCompare = new InstrumentedCompare();
        final Integer[] nums = randomInts(n);
        time("Tournament.sort", () -> TournamentSort.sort(nums, tournamentCompare), tournamentCompare);
        final Integer[] nums2 = randomInts(n);
        final InstrumentedCompare systemCompare = new InstrumentedCompare();
        time("Array.sort", () -> Arrays.sort(nums2, systemCompare), systemCompare);
        for (int i = 0; i < n; i++)
            if (nums[i].compareTo(nums2[i]) != 0) {
                System.err.println("Arrays do not match at index: " + i);
                return;
            }
    }

    private T pop() {
        T result = array[getPlayer(tourney)];
        tourney = isPlayer(tourney) ? 0 : rebuild(tourney);
        return result;
    }

    private int getPlayer(int i) {
        return i <= 0 ? Math.abs(i) : getWinner(i);
    }

    private void setWinner(int root, int winner) {
        matches[root] = winner;
    }

    private void setWinners(int root, int winners) {
        matches[root + 1] = winners;
    }

    private void setLosers(int root, int losers) {
        matches[root + 2] = losers;
    }

    private int getWinner(int root) {
        return matches[root];
    }

    private int getWinners(int root) {
        return matches[root + 1];
    }

    private int getLosers(int root) {
        return matches[root + 2];
    }

    private void setMatch(int root, int winner, int winners, int losers) {
        matches[root] = winner;
        matches[root + 1] = winners;
        matches[root + 2] = losers;
    }

    private int mkMatch(int top, int bot, int root) {
        int top_w = getPlayer(top);
        int bot_w = getPlayer(bot);
        if (comparator.compare(array[top_w], array[bot_w]) <= 0)
            setMatch(root, top_w, top, bot);
        else
            setMatch(root, bot_w, bot, top);
        return root;
    }

    private int mkPlayer(int i) {
        return -i;
    }

    private int knockout(int i, int k, int root) {
        if (i == k) return mkPlayer(i);
        int j = (i + k) / 2;
        return mkMatch(knockout(i, j, 2 * root), knockout(j + 1, k, 2 * root + 3), root);
    }

    private boolean isPlayer(int i) {
        return i <= 0;
    }

    private int rebuild(int root) {
        if (isPlayer(getWinners(root)))
            return getLosers(root);
        else {
            setWinners(root, rebuild(getWinners(root)));
            if (comparator.compare(array[getPlayer(getLosers(root))], array[getPlayer(getWinners(root))]) < 0) {
                setWinner(root, getPlayer(getLosers(root)));
                int temp = getLosers(root);
                setLosers(root, getWinners(root));
                setWinners(root, temp);
            } else
                setWinner(root, getPlayer(getWinners(root)));
            return root;
        }
    }

    static class InstrumentedCompare implements Comparator<Integer> {
        int count = 0;

        public int compare(Integer a, Integer b) {
            count++;
            return a.compareTo(b);
        }
    }

}
