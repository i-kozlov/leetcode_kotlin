import other.TreeNode
import java.util.PriorityQueue

class Solution703 {

    class KthLargest(k: Int, nums: IntArray) {
        private val queue = PriorityQueue<Int>(k + 1) { a, b -> a - b } //to throw the smallest element
        private val kth = k

        private fun put(num: Int) {
            if (queue.size < kth) {
                queue.offer(num)
            } else if (queue.peek() < num) {
                queue.poll()
                queue.offer(num)
            }
        }

        init {
            nums.forEach { put(it) }
        }

        fun add(`val`: Int): Int {

            put(`val`)
            return queue.peek()
        }

    }


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add test
            //Input
            //["KthLargest", "add", "add", "add", "add", "add"]
            //[[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
            //Output
            //[null, 4, 5, 5, 8, 8]

            val kthLargest = KthLargest(3, intArrayOf(4, 5, 8, 2))
            println(kthLargest.add(3))
            println(kthLargest.add(5))
            println(kthLargest.add(10))
            println(kthLargest.add(9))
            println(kthLargest.add(4))


        }
    }
}
