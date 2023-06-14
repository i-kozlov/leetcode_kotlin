package before100

import other.ListNode
//142. Linked List Cycle II
class Solution142 {
    fun detectCycle(head: ListNode?): ListNode? {

        val visitedNodes = mutableSetOf<ListNode>()
        var current = head
        while (current != null) {
            if (visitedNodes.contains(current)) {
                return current
            }
            visitedNodes.add(current)
            current = current.next
        }


        return null
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add test
            //Input: head = [3,2,0,-4], pos = 1

            val node1 = ListNode(3)
            val node2 = ListNode(2)
            val node3 = ListNode(0)
            val node4 = ListNode(-4)
            node1.next = node2
            node2.next = node3
            node3.next = node4
            node4.next = node2

            println(Solution142().detectCycle(node1)?.`val`)

        }
    }
}
