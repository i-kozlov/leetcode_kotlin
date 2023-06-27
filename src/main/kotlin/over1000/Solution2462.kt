package over1000

import java.util.*

class Solution2462 {
    fun totalCost(costs: IntArray, k: Int, candidates: Int): Long {
        var (left, right) = (0 to costs.size - 1)
        var hired = 0
        var cost = 0L
        val head = PriorityQueue<Int>()
        val tail = PriorityQueue<Int>()

        var i = 0
        while (i < candidates && left <= right) {
            head.add(costs[left++])
            if (left < right) {
                tail.add(costs[right--])
            }
            i++
        }


        while (hired < k && !(head.isEmpty() && tail.isEmpty())) {

            cost += when {
                head.isEmpty() -> tail.poll()
                tail.isEmpty() -> head.poll()
                tail.peek() < head.peek() -> tail.poll()
                else -> head.poll()

            }


            if(left <= right && head.size < candidates){
                head.add(costs[left++])
            }
            if(left <= right && tail.size < candidates){
                tail.add(costs[right--])
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
