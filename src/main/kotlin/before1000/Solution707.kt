//https://leetcode.com/problems/design-linked-list/
class Solution707 {
}

class MyLinkedList() {

    /**
     *   private val list = LinkedList<Int>()
     *
     *     fun get(index: Int): Int {
     *         return list.getOrNull(index) ?: -1
     *     }
     *
     *     fun addAtHead(`val`: Int) {
     *         list.add(0, `val`)
     *     }
     *
     *     fun addAtTail(`val`: Int) {
     *         list.add(`val`)
     *     }
     *
     *     fun addAtIndex(index: Int, `val`: Int) {
     *         if (index > list.size) return
     *         list.add(index, `val`)
     *     }
     *
     *     fun deleteAtIndex(index: Int) {
     *         if (index >= list.size) return
     *         list.removeAt(index)
     *     }
     */

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
        var prev: ListNode? = null
    }

    private var head: ListNode? = null
    private var tail: ListNode? = null

    //    private val list = LinkedList<Int>()
    private var size = 0

    fun get(index: Int): Int {
        return getNode(index)?.`val` ?: -1
    }

    private fun getNode(index: Int): ListNode? {
        if (index >= size) return null

        var current = head
        var i = 0
        while (i++ < index)
            current = current?.next

        return current
    }

    fun addAtHead(`val`: Int) {
        val oldHead = head
        val node = ListNode(`val`)
        node.next = head

        oldHead?.let {
            oldHead.prev = node
        }


        if (tail == null) {
            tail = node
        }
        head = node
        size++
    }

    fun addAtTail(`val`: Int) {
        val node = ListNode(`val`)
        if (head == null) {
            head = node
            tail = node
        }
        val last = tail
        node.prev = last
        last?.let { it.next = node }

        tail = node
        size++
    }

    fun addAtIndex(index: Int, `val`: Int) {
        if (index > size) return

        if(index == 0) {
            addAtHead(`val`)
            return
        }
        if (index == size) {
            addAtTail(`val`)
            return
        }

        getNode(index)?.let { foundNode ->
            val newNode = ListNode(`val`)
            val oldPrev = foundNode.prev

            //fix found
            foundNode.prev = newNode

            //fix previous
            oldPrev?.next = newNode

            //set new
            newNode.prev = oldPrev
            newNode.next = foundNode

            size++
        }
    }

    fun deleteAtIndex(index: Int) {
        if (index >= size) return
        getNode(index)?.let { foundNode ->
            val prev = foundNode.prev
            val next = foundNode.next

            prev?.next = foundNode.next
            next?.prev = foundNode.prev

            if(index == 0) head = next
            if(index == size - 1) tail = prev

            size--
        }
    }

}


fun main() {
    var myLinkedList = MyLinkedList()
    myLinkedList.addAtHead(1)
    myLinkedList.addAtTail(3)
    myLinkedList.addAtIndex(1, 2) // linked list becomes 1->2->3

    myLinkedList.get(1) // return 2

    myLinkedList.deleteAtIndex(1) // now the linked list is 1->3

    println( myLinkedList.get(1)) // return 3

    println("myLinkedList = ${myLinkedList}")

    myLinkedList = MyLinkedList()
    myLinkedList.addAtHead(7)
    myLinkedList.addAtHead(2)
    myLinkedList.addAtHead(1)
    myLinkedList.addAtIndex(3, 0)
    myLinkedList.deleteAtIndex(2)
    myLinkedList.addAtHead(6)
    myLinkedList.addAtTail(4)
    val a = myLinkedList.get(4)
    println(a)
    myLinkedList.addAtHead(4)
    myLinkedList.addAtIndex(5, 0)
    myLinkedList.addAtHead(6)


    myLinkedList = MyLinkedList()
    myLinkedList.addAtHead(1)
    myLinkedList.addAtTail(3)
    myLinkedList.addAtIndex(1, 2) // linked list becomes 1->2->3

    println( myLinkedList.get(1)) // return 2
    myLinkedList.deleteAtIndex(0)
    println(myLinkedList.get(0))

    myLinkedList = MyLinkedList()
    myLinkedList.addAtIndex(0, 10)
    myLinkedList.addAtIndex(0, 20)
    myLinkedList.addAtIndex(1, 30)
    println(myLinkedList.get(0))
}