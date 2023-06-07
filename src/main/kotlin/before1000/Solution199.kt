import other.TreeNode

class Solution199 {
    fun rightSideView(root: TreeNode?): List<Int> {
        val list = mutableListOf<Int>()
        var cur = root
        while(cur != null){
            list.add(cur.`val`)
            cur = cur.right
        }

        return list
    }


    companion object {
        @JvmStatic fun main(args : Array<String>) {

        }
    }
}
