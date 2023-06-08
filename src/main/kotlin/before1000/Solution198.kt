class Solution198 {

    fun rob_v3(nums: IntArray): Int {
        var counter = 0
        val map = object : HashMap<Int, Int>() {
            override fun get(key: Int): Int? {
                counter += 1
                return super.get(key)
            }
        }

        val a = robMax(nums, 0, map)
        println("counter = $counter")
        return a
    }

    private fun robMax(nums: IntArray, start: Int, memo: HashMap<Int, Int>): Int {
        if (memo.containsKey(start)) {
            return memo.get(start)!!
        }
        when (nums.size - start) {
            0 -> return 0
            1 -> return nums[start]
            2 -> return maxOf(nums[start], nums[start + 1])
        }

        val a = maxOf(
            nums[start] + robMax(nums, start + 2, memo),
            robMax(nums, start + 1, memo)
        )
        memo[start] = a
        return a
    }


    object a {
        var counter = 0
    }

    private fun robMax2(nums: IntArray, start: Int): Int {
        a.counter++
        var max = 0
        for (i in start until nums.size) {
            val current = nums[i]
            val next = robMax2(nums, i + 2)
            max = maxOf(max, current + next)
        }
        return max
    }

    fun rob(nums: IntArray): Int {
        var (rob1, rob2) = 0 to 0
        for (n in nums) {
            //rob1, rob2, n, n+1
            val temp = maxOf(rob1 + n, rob2)
            rob1 = rob2
            rob2 = temp
        }

        return rob2
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add example and check result
            var ans = Solution198().rob(intArrayOf(1, 2, 3, 1))
            println(ans to Solution198().robMax2(intArrayOf(1, 2, 3, 1), 0))
            println("a.counter " + a.counter)

            ans = Solution198().rob(intArrayOf(5, 2, 3, 5))
            println(ans)

            ans = Solution198().rob(intArrayOf(5, 2, 3, 5, 1))
            println(ans)

        }
    }
}
