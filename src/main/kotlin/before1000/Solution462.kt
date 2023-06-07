//https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
class Solution462 {
    fun minMoves2(nums: IntArray): Int {

        val median = findMedian(nums)
        return nums.map { num -> Math.abs(num - median) }.sum()
    }

    private fun findMedian(nums: IntArray): Int {
        val sorted = nums.sorted()
        if (sorted.size % 2 == 0) {
            //среднее двух средних
            return (sorted[sorted.size / 2] + sorted[sorted.size / 2 - 1]) / 2
        } else {
            return sorted[sorted.size / 2]
        }
    }
}
