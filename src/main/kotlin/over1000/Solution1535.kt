package over1000

import other.TreeNode
import java.util.*
import kotlin.collections.HashMap

class Solution1535 {

    fun getWinner(arr: IntArray, k: Int): Int {
        //if k> arr.size - we will loop though all elements anyway
        if (k > arr.size) return arr.max()

        var (L, R) = 0 to 1
        var wins = 0

        while (R < arr.size) {
            if (arr[L] > arr[R]) {
                wins++
            } else {
                L = R
                wins = 1
            }

            if (wins == k) {
                return arr[L]
            }
            R++
        }
        //look like we looped though all item but didn't win enough time with last number - just use it as-is
        return arr[L]
    }
}
