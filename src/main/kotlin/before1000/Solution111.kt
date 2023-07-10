package before1000

import other.TreeNode
import java.util.*

class Solution111 {

    fun minDepth(root: TreeNode?): Int {
        if (root == null) return 0

        val queue = LinkedList<TreeNode>()
        var current: TreeNode = root
        var depth = 0

        queue.push(root)
        while (queue.isNotEmpty()) {
            depth++
            for(i in 1 .. queue.size){
                current = queue.pop()
                if (current.left == null && current.right == null) return depth

                current.left?.let { queue.offer(it) }
                current.right?.let { queue.offer(it) }
            }

        }


        return depth
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add example
        }
    }
}
