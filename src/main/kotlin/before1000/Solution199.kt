import other.TreeNode

class Solution199 {
    fun rightSideView(root: TreeNode?): List<Int> {
        val list = mutableListOf<Int>()

        fun traverse(root: TreeNode?, depth: Int){
            if(root == null) return

            if(list.size == depth){
                list.add(depth, root.`val`)
            }

            traverse(root.right, depth + 1)
            traverse(root.left, depth + 1)
        }

        traverse(root, 0)
        return list
    }


    companion object {
        @JvmStatic fun main(args : Array<String>) {
            //add example
            val root = TreeNode(1)
            root.left = TreeNode(2)
            root.right = TreeNode(3)
            root.left?.right = TreeNode(5)
            root.right?.right = TreeNode(4)

            println(Solution199().rightSideView(root))

        }
    }
}
