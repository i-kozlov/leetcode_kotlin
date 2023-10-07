package leetcode.problem100_199

import java.util.Stack

class Solution155 {
}

class MinStack() {
    //number and min
    private val stack = Stack<Pair<Int, Int>>()

    fun push(`val`: Int) {
        if (stack.isEmpty()) {
            stack.push(`val` to `val`)
        } else {
            val min = minOf(`val`, stack.peek().second)
            stack.push(`val` to min)
        }

    }

    fun pop() {
        stack.pop()
    }

    fun top(): Int {
        return stack.peek().first
    }

    fun getMin(): Int {
        return stack.peek().second
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */
