package before1000

import other.TreeNode
import kotlin.math.abs

class Solution219 {

    fun containsNearbyDuplicate_v1(nums: IntArray, k: Int): Boolean {
        val map = mutableMapOf<Int, Int>()
        for (i in 0..nums.lastIndex) {
            val n = nums[i]
            if (map.contains(n)) {
                if (Math.abs(map[n]!! - i) <= k) {
                    return true
                }
            }
            //keep one with max index so future index - mapped index  to be minimal
            map[n] = i
        }

        return false
    }

    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
//        val window = mutableSetOf<Int>()
        val window = LinkedHashSet<Int>()

        //abs(i-j) <= k - keep only k items
        for (i in 0..nums.lastIndex) {
            if (window.size >= k) {
                //remove oldest
                window.remove(i - k)
            }

            //same in last k items
            if(nums[i] in window) return true

            window.add(nums[i])

        }

        return false
    }


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            //add examples
            //Input: nums = [1,2,3,1], k = 3
            //Output: true
            val s = Solution219()
            println(s.containsNearbyDuplicate(intArrayOf(1, 2, 3, 1), 3))

            println(s.containsNearbyDuplicate(intArrayOf(1, 0, 1, 1), 1))

            println(s.containsNearbyDuplicate(intArrayOf(1, 2, 3, 1, 2, 3), 2))
        }
    }
}
