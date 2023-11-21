package over1000

class Solution1814 {
    fun countNicePairs(nums: IntArray): Int {
        val diff = IntArray(nums.size)

        for (i in 0..nums.size - 1) {
            diff[i] = nums[i] - rev(nums[i])
        }

        //n * (n - 1) /2
        val map = HashMap<Int, Long>()
        val MOD = 1e9.toInt() + 7
        var ans = 0L
        diff.forEach {
            val count = map.getOrDefault(it, 0) % MOD
            ans += count
            map[it] = count + 1
        }

        return (ans % MOD).toInt()
        //return map.map { (_, it) -> it * (it - 1) / 2 }.sum() % MOD

    }

    private fun rev(x: Int): Int {
        return x.toString().reversed().toInt()
        //  int num = x;
        //  int result = 0;
        //    while (num > 0) {
        //        result = result * 10 + num % 10;
        //        num /= 10;
        //    }
        //
        //    return result;
    }
}
