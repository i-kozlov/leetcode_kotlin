package before100

import other.ListNode

//https://leetcode.com/problems/merge-k-sorted-lists/
class Solution23 {

    fun mergeKLists_v1(lists: Array<ListNode?>): ListNode? {
        val pointers = lists.copyOf()
        val dummy = ListNode(-1)
        var tail = dummy
        while (pointers.any { node -> node != null }) {
            val values = IntArray(pointers.size)
            pointers.indices.forEach {
                val node: ListNode? = pointers[it]
                values[it] = node?.`val` ?: 100000
            }
            val idx = values.indexOf(values.min())
            val node = pointers[idx]
            tail.next = node
            pointers[idx] = node?.next

            tail = tail.next
        }


        return dummy.next
    }

    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        val pointers = lists.copyOf()
        val minValues = pointers.map { node -> node?.`val` ?: 100000 }.toIntArray()
        var lastChosenPointer = 0

        val dummy = ListNode(-1)
        var tail = dummy

        //1.варианты ускорения - иметь не массив, а список и выкидывать из него ноды когда будет null
        //не сравнивать minValues.min() каждый раз, а помнить 2 минимальных?
        //pointers.any { node -> node != null } а смотреть на minValues
        while (pointers.any { node -> node != null }) {

            //update only last chosen pointer min
            minValues[lastChosenPointer] = pointers[lastChosenPointer]?.`val` ?: 100000

            val idx = minValues.indexOf(minValues.min()!!)
            lastChosenPointer = idx

            val node = pointers[lastChosenPointer]
            tail.next = node
            pointers[idx] = node?.next

            tail = tail.next!!
        }


        return dummy.next
    }

}

fun main() {
    val arr: Array<ListNode?> = arrayOf(

        ListNode(
            1, ListNode(
                4,
                ListNode(5)
            )
        ),
        ListNode(
            1, ListNode(
                3,
                ListNode(4)
            )
        ),
        ListNode(2, ListNode(6))
    )

    println(Solution23().mergeKLists(arr))
}
