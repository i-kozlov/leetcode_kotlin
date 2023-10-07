package before100

import other.TreeNode

class Solution94 {
    fun inorderTraversal(root: TreeNode?): List<Int> {

        fun dfs(root: TreeNode?, result: MutableList<Int>) {
            if(root == null) return
            root.left?.let { dfs(it, result) }
            result.add(root.`val`)
            root.right?.let { dfs(it, result) }
        }

        val list = mutableListOf<Int>()
        dfs(root, list)
        return list
    }

    companion object {
        @JvmStatic fun main(args : Array<String>) {

        }
    }
}
