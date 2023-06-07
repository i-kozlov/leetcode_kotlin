class Solution198 {

    fun rob(nums: IntArray): Int {
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


    private fun robMax2(nums: IntArray, start: Int): Int {
        var max = 0
        for (i in start until nums.size) {
            val current = nums[i]
            val next = robMax2(nums, i + 2)
            max = maxOf(max, current + next)
        }
        return max
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add example and check result
            var ans = Solution198().rob(intArrayOf(1, 2, 3, 1))
            println(ans)

            ans = Solution198().rob(intArrayOf(5, 2, 3, 5))
            println(ans)

            ans = Solution198().rob(intArrayOf(5, 2, 3, 5, 1))
            println(ans)

            ans = Solution198().rob(intArrayOf(5, 2, 3, 5, 1, 2, 3, 5, 1, 2, 3, 5, 1, 2, 3, 5, 1, 1))
            val arr =(1 .. 21000 ).toList().toIntArray()
            ans = Solution198().rob(arr)
            println(ans)

        }
    }
}
