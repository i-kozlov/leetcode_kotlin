package before100

class Solution21 {
    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var head1 = list1
        var head2 = list2

        val dummy = ListNode(-1)
        var tail: ListNode = dummy

        //when the value left only in one list - just append other list to the end
        while (head1 != null && head2 != null) {
            if (head1.`val` < head2.`val`) {
                tail.next = head1
                head1 = head1.next
            } else {
                tail.next = head2
                head2 = head2.next
            }

            tail = tail.next!!
        }

        if (head1 != null) {
            tail.next = head1
        } else if (head2 != null) {
            tail.next = head2
        }


        return dummy.next
    }

}
