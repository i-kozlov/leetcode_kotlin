package before1000

import other.TreeNode
import java.util.*

class Solution373 {
    fun kSmallestPairs(nums1: IntArray, nums2: IntArray, k: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        val visited = mutableSetOf<Pair<Int, Int>>()
        val q = PriorityQueue<Pair<Int, Int>>(k, compareByDescending { it.first + it.second })

        q.offer(nums1[0] to nums2[0])
        visited.add(0 to 0)


        for (i in nums1.indices) {



            for (j in nums2.indices) {

                if (i to j in visited) continue;
                visited.add(i to j)
                if (q.size < k) {
                    q.offer(nums1[i] to nums2[j])
                } else {
                    val c = q.peek()
                    if (nums1[i] + nums2[j] < c.first + c.second) {
                        q.poll()
                        q.offer(nums1[i] to nums2[j])
                    } else {
                        break;
                    }

                }

            }
        }
        while (q.isNotEmpty()) {
            val item = q.poll()
            result.add(listOf(item.first, item.second))
        }

        return result
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add example
            //Input: nums1 = [1,1,2], nums2 = [1,2,3], k = 2
            //Output: [[1,1],[1,1]]
            val nums1 = intArrayOf(1, 1, 2)
            val nums2 = intArrayOf(1, 2, 3)
            val k = 2
            println(Solution373().kSmallestPairs(nums1, nums2, k))
        }
    }
}
