package before100

import other.TreeNode

class Solution62 {

    fun uniquePaths(m: Int, n: Int): Int {
        val dp = mutableMapOf((0 to 0) to 1)

        fun calc(x: Int, y: Int): Int {
            if (x < 0 || y < 0) return 0
            if (x >= m || y >= n) return 0
            if (dp.containsKey(x to y)) return dp[x to y]!!

            dp[x to y] = calc(x - 1, y) + calc(x, y - 1)
            return dp[x to y]!!
        }

        return calc(m - 1, n - 1)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //tests
            val s = Solution62()
            println(s.uniquePaths(3, 7))
            println(s.uniquePaths(3, 2))

        }
    }
}
