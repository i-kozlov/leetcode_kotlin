package leetcode.problem100_199

import other.TreeNode
//https://leetcode.com/problems/path-sum/
class Solution112 {

    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {

        return dfs(root, targetSum)
    }

    private fun dfs(root: TreeNode?, targetSum: Int): Boolean{
        if(root == null) return false
        val isLeaf = root.left == null && root.right == null
        if (root.`val` == targetSum && isLeaf) return true

        if (dfs(root.left, targetSum - root.`val`)) return true
        if (dfs(root.right, targetSum - root.`val`)) return true

        return false
    }

    companion object {
        @JvmStatic fun main(args : Array<String>) {
            //add test [1,2]
            //Output: false

            val root1 = TreeNode(1)
            root1.left = TreeNode(2)
            println(Solution112().hasPathSum(root1, 1))

            //add test
            //Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
            //Output: true
            val root = TreeNode(5)
            root.left = TreeNode(4)
            root.right = TreeNode(8)
            root.left?.left = TreeNode(11)
            root.right?.left = TreeNode(13)
            root.right?.right = TreeNode(4)
            root.left?.left?.left = TreeNode(7)
            root.left?.left?.right = TreeNode(2)
            root.right?.right?.right = TreeNode(1)
            println(Solution112().hasPathSum(root, 22))

            //add test Input: root = [1,2,3], targetSum = 5
            //Output: false
            val root2 = TreeNode(1)
            root2.left = TreeNode(2)
            root2.right = TreeNode(3)
            println(Solution112().hasPathSum(root2, 5))

            //Input: root = [], targetSum = 0
            //Output: false
            println(Solution112().hasPathSum(null, 0))

        }
    }
}
