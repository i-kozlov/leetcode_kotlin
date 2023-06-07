import other.TreeNode

class Solution453 {
//todo
    fun minMoves(nums: IntArray): Int {
        val median = findMedian(nums)
        val diff = nums.map { num -> Math.abs(num - median) }
return 0
    }

    private fun findMedian(nums: IntArray): Int {
        val sorted = nums.sorted()
        if (sorted.size % 2 == 0) {
            //среднее двух средних
            return (sorted[sorted.size / 2] + sorted[sorted.size / 2 - 1]) / 2
        } else {
            return sorted[sorted.size / 2]
        }
    }

    companion object {
        @JvmStatic fun main(args : Array<String>) {

        }
    }
}
