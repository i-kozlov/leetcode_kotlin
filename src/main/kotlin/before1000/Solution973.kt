import other.TreeNode
import java.util.PriorityQueue

//https://leetcode.com/problems/k-closest-points-to-origin/
class Solution973 {

    fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {

        val heap = PriorityQueue<IntArray>(k) { a, b ->
            -1 * (a[0] * a[0] + a[1] * a[1]).compareTo((b[0] * b[0] + b[1] * b[1]))
        }
        points.forEach { point ->
            heap.offer(point)
            if (heap.size > k) {
                heap.poll()
            }
        }

        return heap.toTypedArray()
    }


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

        }
    }
}
