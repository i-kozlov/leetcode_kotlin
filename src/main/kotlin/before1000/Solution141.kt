class Solution141 {
    /**
     * Example:
     * var li = other.ListNode(5)
     * var v = li.`val`
     * Definition for singly-linked list.
     */
    class ListNode(var `val`: Int) {
        val next: ListNode? = null
    }

    fun hasCycle(head: ListNode?): Boolean {
        if (head?.next?.next == null) return false
        var slow: ListNode? = head.next
        var fast: ListNode? = head.next.next
        do {
            slow = slow?.next
            fast = fast?.next?.next
            if (slow == fast) return true
        } while (fast != null)

        return false

    }
}

fun main() {
    val s = Solution141()
    println(s.hasCycle(Solution141.ListNode(1)))
    //add tests

}