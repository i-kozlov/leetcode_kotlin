package before1000

import other.TreeNode
//530. Minimum Absolute Difference in BST
class Solution530 {

    fun minDiffInBST(root: TreeNode?): Int {
        return getMinimumDifference(root)
    }
    fun getMinimumDifference(root: TreeNode?): Int {
        val list = mutableListOf<Int>()

        fun dfs(node: TreeNode?) {
            if (node == null) return
            dfs(node.left)
            list.add(node.`val`)
            dfs(node.right)
        }

        dfs(root)
        var min = Int.MAX_VALUE
        for (i in 0 until list.size - 1) {
            val diff = list[i + 1] - list[i]
            min = minOf(min, diff)
        }

        return min
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add example

            //Input: root = [4,2,6,1,3]
            //Output: 1
            val root = TreeNode(4)
            root.left = TreeNode(2)
            root.right = TreeNode(6)
            root.left?.left = TreeNode(1)
            root.left?.right = TreeNode(3)

            println(Solution530().minDiffInBST(root))



        }
    }
}
