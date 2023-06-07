package s1000

class Solution1929 {
    /**
     * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
     *
     * Specifically, ans is the concatenation of two nums arrays.
     *
     * Return the array ans.
     */
    fun getConcatenation2(nums: IntArray): IntArray {
        val ans = IntArray(nums.size * 2)
        nums.indices.forEach { i ->
            ans[i] = nums[i]
            ans[i + nums.size] = nums[i]
        }

        return ans
    }

    fun getConcatenation3(nums: IntArray): IntArray = nums+nums

    fun getConcatenation(nums: IntArray) = intArrayOf(*nums, *nums)
}
