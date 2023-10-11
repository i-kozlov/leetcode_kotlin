package leetcode.problem001_099

import other.TreeNode

class Solution34 {

    fun searchRange(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2)

        var (L, R) = 0 to nums.size - 1
        //find target
        while (L <= R) {
            val mid = (L + R) / 2
            if (nums[mid] == target) {
                val ans = findIndexes(nums, mid)
                result[0] = ans.first
                result[1] = ans.second
                return result
            } else if (nums[mid] > target) {
                R = mid - 1
            } else {
                L = mid + 1
            }
        }

        result[0] = -1
        result[1] = -1
        return result

    }

    private fun findIndexes(nums: IntArray, start: Int): Pair<Int, Int> {
        var L = start
        while (L - 1 >= 0 && nums[L - 1] == nums[start]) {
            L--
        }
        var R = start
        while (R + 1 < nums.size && nums[R + 1] == nums[start]) {
            R++
        }

        return L to R
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add example
        }
    }
}
