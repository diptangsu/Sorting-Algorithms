import java.util.ArrayList
import java.util.Arrays
import java.util.Comparator
import java.util.Random

internal class TournamentSort<T> private constructor(private val comparator: Comparator<T>, var array: Array<T>) {
    private val matches: IntArray
    private var tourney: Int = 0

    init {
        this.matches = IntArray(6 * array.size)
        this.tourney = knockout(0, array.size - 1, 3)
    }

    private fun pop(): T {
        val result = array[getPlayer(tourney)]
        tourney = if (isPlayer(tourney)) 0 else rebuild(tourney)
        return result
    }

    private fun getPlayer(i: Int): Int {
        return if (i <= 0) Math.abs(i) else getWinner(i)
    }

    private fun setWinner(root: Int, winner: Int) {
        matches[root] = winner
    }

    private fun setWinners(root: Int, winners: Int) {
        matches[root + 1] = winners
    }

    private fun setLosers(root: Int, losers: Int) {
        matches[root + 2] = losers
    }

    private fun getWinner(root: Int): Int {
        return matches[root]
    }

    private fun getWinners(root: Int): Int {
        return matches[root + 1]
    }

    private fun getLosers(root: Int): Int {
        return matches[root + 2]
    }

    private fun setMatch(root: Int, winner: Int, winners: Int, losers: Int) {
        matches[root] = winner
        matches[root + 1] = winners
        matches[root + 2] = losers
    }

    private fun mkMatch(top: Int, bot: Int, root: Int): Int {
        val top_w = getPlayer(top)
        val bot_w = getPlayer(bot)
        if (comparator.compare(array[top_w], array[bot_w]) <= 0)
            setMatch(root, top_w, top, bot)
        else
            setMatch(root, bot_w, bot, top)
        return root
    }

    private fun mkPlayer(i: Int): Int {
        return -i
    }

    private fun knockout(i: Int, k: Int, root: Int): Int {
        if (i == k) return mkPlayer(i)
        val j = (i + k) / 2
        return mkMatch(knockout(i, j, 2 * root), knockout(j + 1, k, 2 * root + 3), root)
    }

    private fun isPlayer(i: Int): Boolean {
        return i <= 0
    }

    private fun rebuild(root: Int): Int {
        if (isPlayer(getWinners(root)))
            return getLosers(root)
        else {
            setWinners(root, rebuild(getWinners(root)))
            if (comparator.compare(array[getPlayer(getLosers(root))], array[getPlayer(getWinners(root))]) < 0) {
                setWinner(root, getPlayer(getLosers(root)))
                val temp = getLosers(root)
                setLosers(root, getWinners(root))
                setWinners(root, temp)
            } else
                setWinner(root, getPlayer(getWinners(root)))
            return root
        }
    }

    internal class InstrumentedCompare : Comparator<Integer> {
        var count = 0

        fun compare(a: Integer, b: Integer): Int {
            count++
            return a.compareTo(b)
        }
    }

    companion object {

        fun <T> sort(v: Array<T>, comparator: Comparator<T>) {
            val tourney = TournamentSort(comparator, v)
            val copy = ArrayList(v.size)
            for (ignored in v) copy.add(tourney.pop())
            copy.toArray(v)
        }

        private fun randomInts(n: Int): Array<Integer> {
            val r = Random(12345678)
            val v = arrayOfNulls<Integer>(n)
            for (i in 0 until n)
                v[i] = r.nextInt(10 * n)
            return v
        }

        private fun time(description: String, action: Runnable, compare: InstrumentedCompare) {
            val start = System.currentTimeMillis()
            action.run()
            val finish = System.currentTimeMillis()
            System.out.println(description + " took " + (finish - start).toDouble() / 1000.0 + " secs " + compare.count + " comparisons")
        }

        fun main(args: Array<String>) {
            val n = if (args.size >= 1) Integer.parseInt(args[0]) else 100000
            val tournamentCompare = InstrumentedCompare()
            val nums = randomInts(n)
            time("Tournament.sort", { TournamentSort.sort(nums, tournamentCompare) }, tournamentCompare)
            val nums2 = randomInts(n)
            val systemCompare = InstrumentedCompare()
            time("Array.sort", { Arrays.sort(nums2, systemCompare) }, systemCompare)
            for (i in 0 until n)
                if (nums[i].compareTo(nums2[i]) !== 0) {
                    System.err.println("Arrays do not match at index: $i")
                    return
                }
        }
    }

}
