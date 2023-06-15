package over1000

import other.TreeNode
import java.util.LinkedList

class Solution1161 {

    fun maxLevelSum(root: TreeNode?): Int {
        if (root == null) return 0
        val queue = LinkedList<TreeNode>()

        queue.add(root)
        var maxSum = Int.MIN_VALUE
        var currentLevel = 0
        var levelWithMaxSum = 1

        while (queue.isNotEmpty()) {
            currentLevel++
            var levelSum = 0
            for (i in 1..queue.size) {
                val node = queue.poll()
                levelSum += node.`val`
                node.left?.let { queue.add(it) }
                node.right?.let { queue.add(it) }
            }
            if (levelSum > maxSum) {
                maxSum = levelSum
                levelWithMaxSum = currentLevel
            }
        }


        return levelWithMaxSum
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add example
            //Input: root = [1,7,0,7,-8,null,null]
            //Output: 2
            val root = TreeNode(1)
            root.left = TreeNode(7)
            root.right = TreeNode(0)
            root.left?.left = TreeNode(7)
            root.left?.right = TreeNode(-8)
            println(Solution1161().maxLevelSum(root))

        }
    }
}
