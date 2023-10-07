package leetcode.problem100_199

import other.TreeNode

class Solution105 {

    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        if (preorder.isEmpty()) return null

        //preorder: root, left, right
        val rootValue = preorder[0]
        val inoderRootIndex = inorder.indexOf(rootValue)
        val preorderRootIndex = preorder.indexOf(rootValue)
        //int[] newArray = Arrays.copyOfRange(oldArray, startIndex, endIndex);
        //take ( inorderRootIndex)
        val inorderForLeft = inorder.sliceArray(0 until inoderRootIndex)
        //drop 1 - inorderForLeft.size
        val preOrderForLeft = preorder.sliceArray(1 until inorderForLeft.size + 1)//drop  element


                                                    //+1 from root element
        val inorderForRight = inorder.sliceArray(inoderRootIndex + 1 until inorder.size)
        val preOrderForRight = preorder.sliceArray(preOrderForLeft.size + 1 until preorder.size)

        val root = TreeNode(rootValue)
        root.left = buildTree(preOrderForLeft, inorderForLeft)
        root.right = buildTree(preOrderForRight, inorderForRight)

        return root
    }


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add example
            //Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
            //Output: [3,9,20,null,null,15,7]
            val root = Solution105().buildTree(intArrayOf(3, 9, 20, 15, 7), intArrayOf(9, 3, 15, 20, 7))
            println(root)

        }
    }
}
