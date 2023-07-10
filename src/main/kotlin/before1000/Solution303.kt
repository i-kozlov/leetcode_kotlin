package before1000

import other.TreeNode

class Solution303 {


    class NumArray(nums: IntArray) {
        private val prefixSums = IntArray(nums.size)

        init {
            prefixSums[0] = nums[0]
            for(i in 1 until nums.size) {
                prefixSums[i] = prefixSums[i-1] + nums[i]
            }
        }

        fun sumRange(left: Int, right: Int): Int {

            return prefixSums[right] - if(left == 0) 0 else prefixSums[left - 1]
        }

    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add example
            //-2, 0, 3, -5, 2, -1
            val nums = intArrayOf(-2, 0, 3, -5, 2, -1)
            val numArray = NumArray(nums)
            println(numArray.sumRange(0, 2))

        }
    }
}
