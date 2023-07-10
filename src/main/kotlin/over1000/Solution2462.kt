package over1000

import java.util.*

class Solution2462 {
    fun totalCost(costs: IntArray, k: Int, candidates: Int): Long {
        var (left, right) = (0 to costs.size - 1)
        var hired = 0
        var cost = 0L

        val headQueue = PriorityQueue<Int>()
        val tailQueue = PriorityQueue<Int>()

        while (headQueue.size < candidates && left <= right) {
            headQueue.offer(costs[left++])
        }

        while (tailQueue.size < candidates && left <= right) {
            tailQueue.offer(costs[right--])
        }


        while (hired < k && !(headQueue.isEmpty() && tailQueue.isEmpty())) {

            cost += when {
                headQueue.isEmpty() -> tailQueue.poll()
                tailQueue.isEmpty() -> headQueue.poll()
                tailQueue.peek() < headQueue.peek() -> tailQueue.poll()
                else -> headQueue.poll()
            }

            if (left <= right && headQueue.size < candidates) {
                headQueue.add(costs[left++])
            }
            if (left <= right && tailQueue.size < candidates) {
                tailQueue.add(costs[right--])
            }

            hired++
        }

        return cost
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add example
            //Input: costs = [17,12,10,2,7,2,11,20,8], k = 3, candidates = 4
            //Output: 11
            val costs = intArrayOf(17, 12, 10, 2, 7, 2, 11, 20, 8)
            val k = 3
            val candidates = 4
            println(Solution2462().totalCost(costs, k, candidates))

        }
    }
}
