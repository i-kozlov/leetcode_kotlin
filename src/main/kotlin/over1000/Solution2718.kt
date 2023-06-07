package over1000

import other.TreeNode

class Solution2718 {

    fun matrixSumQueries(n: Int, queries: Array<IntArray>): Long {
//        var sum = 0L
        val matrix = Array(n) { Array<Pair<Int, Boolean>>(n) { 0 to false } }
        var modificationsCount = 0

        for (i in queries.lastIndex downTo 0) {
            if (modificationsCount >= n * n) break

            val (type, index, value) = queries[i]

            when (type) {
                //row update
                0 -> {
                    val row = matrix[index]
                    for (cellIDx in row.indices) {
                        if (row[cellIDx].second.not()) {
                            row[cellIDx] = value to true
                            modificationsCount++
                        }
                    }

                }

                1 -> {
                    for (row in matrix) {
                        if (row[index].second.not()) {
                            row[index] = value to true
                            modificationsCount++
                        }
                    }
                }
            }
        }


        return matrix.map { it.map { it.first }.sum().toLong() }.sum()
    }

    companion object {
        @JvmStatic fun main(args : Array<String>) {

        }
    }
}
