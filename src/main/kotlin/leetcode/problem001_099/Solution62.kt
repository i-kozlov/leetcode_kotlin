package before100

import other.TreeNode

class Solution62 {

    fun uniquePaths2(m: Int, n: Int): Int {
        val cur = IntArray(n) { 1 }
        val next = IntArray(n)
        next[0] = 1

        for (i in 1..m - 1) {
            for (j in 1..n - 1) {
                next[j] = cur[j] + next[j - 1]
            }
            cur.forEachIndexed { index, i -> cur[index] = next[index] }

        }
        return cur[n - 1]
    }

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
}
