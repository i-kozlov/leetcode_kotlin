package leetcode.problem500_599

import other.TreeNode

class Solution554 {
    fun leastBricks(wall: List<List<Int>>): Int {
        val  height = wall.size
        val width = wall[0].sum()
        //cross at vs number of cross
        val map = mutableMapOf<Int, Int>()

        for (list in wall) {

            var blockStart = 0
            for (blockSize in list) {
                val blockEnd = blockStart + blockSize
                //if not using + 1 - this check is redundant
                if (blockEnd < width) {
                    val crossed = map.getOrDefault(blockEnd, 0)
                    map[blockEnd] = crossed + 1
                }
                blockStart = blockEnd
            }
        }
        var minCrossed = wall.size

        map.forEach { (_, v) -> minCrossed = Math.min(minCrossed, height - v) }
        return minCrossed
    }
}
