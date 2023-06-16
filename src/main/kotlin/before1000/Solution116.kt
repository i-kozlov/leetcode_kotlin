package before1000

import java.util.LinkedList

class Solution116 {


    class Node(var `val`: Int) {
        var left: Node? = null
        var right: Node? = null
        var next: Node? = null
        override fun toString(): String {
            return "Node(`val`=$`val`, left=$left, right=$right, next=$next)"
        }


    }


        fun connect(root: Node?): Node? {
            if (root == null) return null
            val queue = LinkedList<Node>()

            queue.add(root)
            while (queue.isNotEmpty()){
                var prev: Node? = null
                for (i in 1 .. queue.size){
                    val node = queue.poll()
                    prev?.next = node
                    prev = node

                    node.left?.let { queue.add(it) }
                    node.right?.let { queue.add(it) }
                }
            }

            return root

    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add example
            //Input: root = [1,2,3,4,5,6,7]
            //Output: [1,#,2,3,#,4,5,6,7,#]
            val root = Node(1)
            root.left = Node(2)
            root.right = Node(3)
            root.left?.left = Node(4)
            root.left?.right = Node(5)
            root.right?.left = Node(6)
            root.right?.right = Node(7)

            println( Solution116().connect(root))
        }
    }
}
