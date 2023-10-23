package before100

import other.ListNode

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
class Solution2 {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val dummy = ListNode(-1)
        var p1 = l1
        var p2 = l2
        var cur = dummy
        var carry = 0

        while (p1 != null || p2 != null) {
            val sum = toNum(p1) + toNum(p2) + carry
            carry = sum / 10
            cur.next = ListNode(sum % 10)

            cur = cur.next!!
            p1 = p1?.next
            p2 = p2?.next
        }
        if (carry != 0) cur.next = ListNode(carry)

        return dummy.next
    }

    private fun toNum(head: ListNode?): Int {
        return if (head == null) 0 else head.`val`
    }
}
