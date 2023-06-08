package over1000

import other.TreeNode

class Solution1351 {

    fun countNegatives(grid: Array<IntArray>): Int {
        val (rows, cols) = (grid.size to grid[0].size)
        var (r, c) = (rows - 1 to 0)
        var count = 0
        while (r >= 0 && c < cols) {
            if (grid[r][c] < 0) {
                count += cols - c
                r--
            } else {
                c++
            }
        }

        return count
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
//example 1
            println(
                Solution1351().countNegatives(
                    arrayOf(
                        intArrayOf(4, 3, 2, -1),
                        intArrayOf(3, 2, 1, -1),
                        intArrayOf(1, 1, -1, -2),
                        intArrayOf(-1, -1, -2, -3)
                    )
                )
            )

//example 2
            println(Solution1351().countNegatives(arrayOf(intArrayOf(3, 2), intArrayOf(1, 0))))
        }
    }
}
