package before100

//https://leetcode.com/problems/minimum-path-sum/

class Solution64 {

    fun minPathSum(grid: Array<IntArray>): Int {

        val (ROWS, COLS) = grid.size to grid[0].size
        val cellCostdata = Array<IntArray>(grid.size) { IntArray(grid[0].size) { -1 } }
        cellCostdata[0][0] = grid[0][0]
        getMinCostToCell(grid, cellCostdata, Pair(ROWS - 1, COLS - 1))

        return cellCostdata[ROWS - 1][COLS - 1]
    }

    private fun getMinCostToCell(grid: Array<IntArray>, cellCostdata: Array<IntArray>, cell: Pair<Int, Int>): Int {
        val (x, y) = cell
        if (x < 0 || y < 0) return Int.MAX_VALUE
        if (x >= grid.size || y >= grid[0].size) return Int.MAX_VALUE

        if (cellCostdata[x][y] == -1) {
            val pathBeforeCell = minOf(
                    getMinCostToCell(grid, cellCostdata, Pair(x - 1, y)),
                    getMinCostToCell(grid, cellCostdata, Pair(x, y - 1))
            )
            val calc = pathBeforeCell + grid[x][y]
            cellCostdata[x][y] = calc
        }

        return cellCostdata[x][y]
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add examples
            //Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
            //Output: 7
            //Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
            println(Solution64().minPathSum(arrayOf(intArrayOf(1, 3, 1), intArrayOf(1, 5, 1), intArrayOf(4, 2, 1))))


        }
    }
}
