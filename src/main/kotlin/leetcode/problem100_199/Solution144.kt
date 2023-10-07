package leetcode.problem100_199

import other.TreeNode
import java.util.Stack

class Solution144 {

    fun preorderTraversal_v1(root: TreeNode?): List<Int> {
        return dfs(root, mutableListOf())
    }

    fun dfs(root: TreeNode?, list: MutableList<Int>): List<Int> {
        if(root == null) return list

        list.add(root.`val`)
        dfs(root.left, list)
        dfs(root.right, list)

        return list
    }

    fun preorderTraversal(root: TreeNode?): List<Int> {
        val ans = mutableListOf<Int>()
        if(root == null) return ans

        val stack = Stack<TreeNode>()
        stack.push(root)
        while (stack.isNotEmpty()) {
            val node = stack.pop()
            ans.add(node.`val`)

            node.right?.let { stack.push(it) }
            node.left?.let { stack.push(it) }
        }

        return ans
    }


    companion object {
        @JvmStatic fun main(args : Array<String>) {
            //Input: root = [1,null,2,3]
            //Output: [1,2,3]
            val root = TreeNode(1)
            root.right = TreeNode(2)
            root.right?.left = TreeNode(3)

            val ans = Solution144().preorderTraversal(root)
            println(ans)

        }
    }
}
