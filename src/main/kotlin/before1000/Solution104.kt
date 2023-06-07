import other.TreeNode

class Solution104 {

    fun maxDepth(root: TreeNode?): Int {

        fun countLevel(root: TreeNode?, currentLevel: Int) : Int{
            if(root == null) return currentLevel

            return maxOf(countLevel( root.left, currentLevel+1),
            countLevel( root.right, currentLevel+1)
            )
        }

        return countLevel(root,0)
    }
    companion object {
        @JvmStatic fun main(args : Array<String>) {

        }
    }
}
