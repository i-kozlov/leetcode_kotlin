package other

class ListNode {
    val `val`: Int
    var next: ListNode? = null

    constructor(`val`: Int, next: ListNode?) {
        this.`val` = `val`
        this.next = next
    }

    constructor(`val`: Int) {
        this.`val` = `val`
    }

    override fun toString(): String {
        return "other.ListNode{" +
                "val=" + `val` +
                ", next=" +
                (if (next != null) next.toString() else "") +
                '}'
    }
}