package leetcode.problem1000_1099

import java.util.*

class Solution1004 {
    fun longestOnes(nums: IntArray, k: Int): Int {
        val zeroPositions = LinkedList<Int>()
        var max = 0
        for (i in nums.indices) {
            if (nums[i] == 0) {
                zeroPositions.add(i)
            }
        }

        if (zeroPositions.isEmpty()) return nums.size
        var L = 0
        while (L < nums.size) {

            //where will we stop after replacing this zero
            val stopAt = when {
                zeroPositions.isEmpty() -> nums.size
                k == 0 -> zeroPositions.peek()
                zeroPositions.size > k -> zeroPositions[k] //take k zeros and stop before next
                else -> nums.size
            }
            max = Math.max(max, stopAt - L)
            if(zeroPositions.isEmpty()) break

            val zeroIdx = zeroPositions.poll()
            L = zeroIdx + 1 //move to position after zero
        }
        return max
    }

}
