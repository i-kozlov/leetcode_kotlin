import other.TreeNode
import kotlin.math.abs

class Solution230 {

    //this only goes left way while actually we need to go both ways
    fun kthSmallest_v1(root: TreeNode?, k: Int): Int {

        var current = root!!
        var level = 1
        val levelMaps = mutableMapOf<Int, TreeNode>()
        levelMaps.put(level, current)

        while (current.left != null) {
            current = current.left!!
            level++
            levelMaps.put(level, current)
        }

        //1 = neededLevel
        //2 = neededLevel - 1
        //3 = neededLevel - 2
        val actualIndex = level - k + 1
        return levelMaps[actualIndex]!!.`val`

    }

    //todo решение через stack - кладем верхную ноду, чтобы вернуться
    fun kthSmallest(root: TreeNode?, k: Int): Int {

        fun dfs(root: TreeNode?, result: MutableList<Int>) {
            if(root == null) return

            root.left?.let { dfs(it, result) }
            result.add(root.`val`)
            if(result.size >= k) return
            root.right?.let { dfs(it, result) }
        }

        val list = mutableListOf<Int>()
        dfs(root, list)

        return list[k-1]

    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //define a tree from [3,1,4,null,2]
            val root = TreeNode(3)
            root.left = TreeNode(1)
            root.right = TreeNode(4)
            root.left!!.right = TreeNode(2)

            println(Solution230().kthSmallest(root, 1))
            println(Solution230().kthSmallest(root, 2))

            //build a tree from [1,null,2]
            val root2 = TreeNode(1)
            root2.right = TreeNode(2)
            println(Solution230().kthSmallest(root2, 2))


        }
    }
}
