import java.util.*
import kotlin.collections.ArrayList

class Solution225 {
    class MyStack() {
        val queue: Queue<Int> = LinkedList<Int>();
        val queue2: Queue<Int> = LinkedList<Int>();

        fun push(x: Int) {
            queue.add(x);
        }

        fun pop(): Int {
            //get all except last
            while(queue.size > 1)
                queue2.add(queue.poll())

            val top = queue.poll()
            while (!queue2.isEmpty()){
                queue.add(queue2.poll())
            }
            return top
        }

        fun top(): Int {
            val item = pop()
            queue.add(item)
            return item
        }

        fun empty(): Boolean {
            return queue.isEmpty()
        }

    }
}

fun main() {

    //  Your MyStack object will be instantiated and called as such:
    var obj = Solution225.MyStack()
    obj.push(1)
    obj.push(2)
    var param_3 = obj.top()
    println(param_3)
    var param_2 = obj.pop()
    println(param_2)
    var param_4 = obj.empty()
}
