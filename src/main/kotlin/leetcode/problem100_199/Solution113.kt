package leetcode.problem100_199

import other.TreeNode

class Solution113 {
    fun pathSum(root: TreeNode?, targetSum: Int): List<List<Int>> {
        return pathSum(root, targetSum, listOf())
    }

    fun pathSum(root: TreeNode?, targetSum: Int, nodes: List<Int>): List<List<Int>> {
        if(root == null) return listOf()

        val upd = nodes + (root.`val`)
        val  isLeaf = root.left == null && root.right == null
        val left = pathSum(root.left, targetSum, upd)
        val right = pathSum(root.right, targetSum, upd)
        if(isLeaf && upd.sum() == targetSum){
            return listOf(upd)
        }
        return left + right

    }
}
