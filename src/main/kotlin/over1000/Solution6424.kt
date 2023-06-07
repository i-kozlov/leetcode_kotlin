package s1000

import other.TreeNode

class Solution6424 {

    fun semiOrderedPermutation(nums: IntArray): Int {
        val (min, max) = nums.min()!! to nums.max()!!
        if (nums[0] == min && nums[nums.size - 1] == max) {
            return 0
        }

        val (minIndex, maxIndex) = nums.indexOf(min) to nums.indexOf(max)
        var swapCount = minIndex + nums.size - maxIndex - 1
        if(minIndex > maxIndex) {
            swapCount--
        }
        return swapCount
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add example for Input: nums = [3,1,2]
            println(Solution6424().semiOrderedPermutation(intArrayOf(3, 1, 2)))
            //add example for Input: nums = [1,2,3,4]

            println(Solution6424().semiOrderedPermutation(intArrayOf(1, 2, 3, 4)))

            //add example [2,1,4,3]
            println(Solution6424().semiOrderedPermutation(intArrayOf(2, 1, 4, 3)))

            //add example  [2,4,1,3]

            println(Solution6424().semiOrderedPermutation(intArrayOf(2, 4, 1, 3)))
            //add example  [1,3,4,2,5]

            println(Solution6424().semiOrderedPermutation(intArrayOf(1, 3, 4, 2, 5)))

        }
    }
}
