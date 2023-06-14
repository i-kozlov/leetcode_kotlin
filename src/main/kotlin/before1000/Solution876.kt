package before1000

import other.ListNode

//876. Middle of the Linked List
class Solution876 {

    fun middleNode(head: ListNode?): ListNode? {
        var slow = head
        var fast = head
        while (fast?.next != null){
            fast = fast.next?.next
            slow = slow!!.next
        }

        return slow
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add example
        }
    }
}
