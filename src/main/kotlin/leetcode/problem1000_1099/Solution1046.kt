package leetcode.problem1000_1099

import java.util.*

class Solution1046 {


    fun lastStoneWeight(stones: IntArray): Int {
        val heap = PriorityQueue<Int>(Collections.reverseOrder())
        heap.addAll(stones.toList())

        while (heap.size > 1) {
            (heap.poll() - heap.poll()).also {
//we can put 0 back to heap,  it will not affect the result, but we will make sure
                if (it != 0) {
                    heap.add(it)
                }
            }
        }

        return if(heap.isNotEmpty()) heap.peek() else 0
    }


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add test
            //Input
            //[2,7,4,1,8,1]
            //Output
            //1
            //Expected
            //1
            println(Solution1046().lastStoneWeight(intArrayOf(2, 7, 4, 1, 8, 1)))
            println(Solution1046().lastStoneWeight(intArrayOf(1)))

        }
    }
}
