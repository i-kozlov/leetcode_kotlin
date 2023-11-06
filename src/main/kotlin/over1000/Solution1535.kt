package over1000

import other.TreeNode
import java.util.*
import kotlin.collections.HashMap

class Solution1535 {

    fun getWinner(arr: IntArray, k: Int): Int {
        //if k> arr.size - we will loop though all elements anyway
        if (k > arr.size) return arr.max()

        val list = LinkedList<Int>()
        val winCount = HashMap<Int, Int>()
        arr.forEach { list.add(it) }

        while (true) {
            val idxToMoveBack = if (list[0] > list[1]) 1 else 0
            list.add(list[idxToMoveBack])
            list.removeAt(idxToMoveBack)

            //after moving winner will have idx 0
            val n = list[0]
            winCount[n] = winCount.getOrDefault(n, 0) + 1
            if (winCount[n] == k) return n
        }
        return -1
    }
}
