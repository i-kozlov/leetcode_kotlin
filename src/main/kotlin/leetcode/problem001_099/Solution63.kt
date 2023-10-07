package before100

class Solution63 {
    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        val dp = mutableMapOf((obstacleGrid.size - 1 to obstacleGrid[0].size - 1) to 1)

        fun search(x: Int, y: Int): Int {
            if (x < 0 || y < 0) return 0
            if (x >= obstacleGrid.size || y >= obstacleGrid[0].size) return 0

            if (obstacleGrid[x][y] == 1) return 0
            if (dp.containsKey(x to y)) return dp[x to y]!!

            dp[x to y] = search(x + 1, y) + search(x, y + 1)
            return dp[x to y]!!
        }

        return search(0, 0)
    }


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //tests
            val s = Solution63()
            println(
                s.uniquePathsWithObstacles(
                    arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 0))
                )
            )

            println(
                s.uniquePathsWithObstacles(
                    arrayOf(intArrayOf(0, 1), intArrayOf(0, 0))
                )
            )

        }
    }
}
