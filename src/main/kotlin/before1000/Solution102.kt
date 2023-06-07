import other.TreeNode
import java.util.LinkedList

class Solution102 {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val queue = LinkedList<TreeNode>()
        if(root == null) return emptyList()

        queue.add(root)

        val result = mutableListOf<List<Int>>()
        while (queue.isNotEmpty()){
            val levelNodes = mutableListOf<Int>()
            result.add(levelNodes)

            for (i in 1 .. queue.size){
                val node = queue.poll()
                levelNodes.add(node.`val`)

                node.left?.let { queue.add(it) }
                node.right?.let { queue.add(it) }
            }
        }

        return result
    }

    companion object {
        @JvmStatic fun main(args : Array<String>) {
            //add an example
            val root = TreeNode(3)
            root.left = TreeNode(9)
            root.right = TreeNode(20)
            root.right!!.left = TreeNode(15)
            root.right!!.right = TreeNode(7)

            println(Solution102().levelOrder(root))

        }
    }
}
