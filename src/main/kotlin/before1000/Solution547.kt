import other.TreeNode

class Solution547 {

    fun findCircleNum(isConnected: Array<IntArray>): Int {
        val visited = BooleanArray(isConnected.size)
        var count = 0
        for (i in isConnected.indices) {
            if (!visited[i]) {
                dfs(isConnected, visited, i)
                count++
            }
        }
        return count

    }

    private fun dfs(connected: Array<IntArray>, visited: BooleanArray, i: Int) {

        visited[i] = true
        for (j in connected.indices) {
            if (connected[i][j] == 1 && !visited[j]) {
                dfs(connected, visited, j)
            }
        }
    }

    companion object {
        @JvmStatic fun main(args : Array<String>) {
//add example
            println(Solution547().findCircleNum(arrayOf(intArrayOf(1, 1, 0), intArrayOf(1, 1, 0), intArrayOf(0, 0, 1))))
        }
    }
}
