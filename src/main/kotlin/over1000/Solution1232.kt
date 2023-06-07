package s1000

import other.TreeNode

class Solution1232 {
    fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
        if (coordinates.size == 2) return true
        if (coordinates.size < 2) return false

        val (x0, y0) = coordinates[0]
        val (x1, y1) = coordinates[1]

        for (i in 2 until coordinates.size) {
            val (x, y) = coordinates[i]

            if ((y1 - y0) * (x - x0) != (y - y0) * (x1 - x0)) return false
        }
        return true
    }



    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

        }
    }
}
