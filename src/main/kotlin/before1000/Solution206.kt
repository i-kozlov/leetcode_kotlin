class Solution206 {
    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }


    fun reverseList(head: ListNode?): ListNode? {

        fun reverseList(head: ListNode?, prev: ListNode?): ListNode? {
            if (head == null) return prev
            val next = head.next
            head.next = prev
            return reverseList(next, head)
        }

        return reverseList(head, null)
    }

    fun reverseList2(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var current = head
        while (current != null) {
            val next = current.next
            current.next = prev
            prev = current
            current = next
        }

        return prev
    }

    fun reverseListRecursive(head: ListNode?): ListNode? {
        if (head == null || head.next == null)
            return head

        val newHead = reverseList(head.next)
        head.next!!.next = head
        head.next = null

        return newHead
    }
}
