import java.util.*

class Solution682 {

    fun calPoints(operations: Array<String>): Int {
        val stack = Stack<Int>()

        operations.forEach {
            when (it) {
                "+" -> {
                    val last = stack.pop()
                    val beforeLast = stack.peek()
                    stack.push(last)
                    stack.push(last + beforeLast)

                }

                "D" -> {
                    stack.push(stack.peek() * 2)

                }

                "C" -> {
                    stack.pop()
                }

                else -> {
                    stack.push(it.toInt())
                }
            }
        }

        return stack.sum()
    }

}
