package leetcode.problem100_199

import other.TreeNode

class Solution113 {
    fun pathSum(root: TreeNode?, targetSum: Int): List<List<Int>> {
        return pathSum(root, targetSum, listOf())
    }

    private fun pathSum(root: TreeNode?, targetSum: Int, pathNodes: List<Int>): List<List<Int>> {
        if (root == null) return listOf()

        val diff = targetSum - root.`val`
        val nodes = pathNodes + (root.`val`)
        val isLeaf = root.left == null && root.right == null
        return when {
            !isLeaf -> {
                val left = pathSum(root.left, diff, nodes)
                val right = pathSum(root.right, diff, nodes)
                left + right
            }
            diff == 0 -> listOf(nodes)
            else -> listOf()
        }

    }
}
