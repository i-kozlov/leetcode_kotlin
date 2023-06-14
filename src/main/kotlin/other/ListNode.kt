package other;

public class ListNode {
    public final int val;
    public ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "other.ListNode{" +
                "val=" + val +
                ", next=" +
                ((next != null) ? next.toString() : "") +
                '}';
    }
}