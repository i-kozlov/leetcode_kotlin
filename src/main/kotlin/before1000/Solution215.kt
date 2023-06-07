import other.TreeNode
import java.util.PriorityQueue

class Solution215 {

    fun findKthLargest(nums: IntArray, k: Int): Int {
        val heap = PriorityQueue<Int>(k)
        for(i in nums.indices) {
            heap.offer(nums[i])
            if(heap.size > k) {
                heap.poll()
            }
        }
        return heap.peek()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

        }
    }
}
