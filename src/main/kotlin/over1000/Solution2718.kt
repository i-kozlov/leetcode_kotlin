package over1000

import other.TreeNode

class Solution2718 {

    //You are given an integer n and a 0-indexed 2D array queries where queries[i] = [typei, indexi, vali].
    fun matrixSumQueries(n: Int, queries: Array<IntArray>): Long {
        var sum = 0L
        val cellToModify = n * n
        val visited = mutableSetOf<Pair<Int, Int>>()

        for (i in queries.lastIndex downTo 0) {
            if (visited.size == cellToModify) break


            val (type, index, value) = queries[i]

            when (type) {
                //row update
                0 -> {

                    val x = index
                    for (y in 0..n - 1) {
                        if (visited.contains(x to y)) continue
                        visited.add(x to y)
                        sum += value
                    }

                }

                1 -> {
                    val y = index
                    for (x in 0..n - 1) {
                        if (visited.contains(x to y)) continue
                        visited.add(x to y)
                        sum += value
                    }
                }
            }
        }


        return sum
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

        }
    }
}
