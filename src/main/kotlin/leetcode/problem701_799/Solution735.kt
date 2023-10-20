package leetcode.problem701_799

import java.util.*

class Solution735 {

    fun asteroidCollision(asteroids: IntArray): IntArray {
        val stack = Stack<Int>()

        asteroids.forEach {
            if (stack.isEmpty()) {
                stack.push(it)
            } else {
                interact(stack, it)
            }

        }
        return stack.toIntArray()
    }

    private fun canCollide(L: Int, R: Int) :Boolean = (L > 0 && R < 0)

    private fun interact(stack: Stack<Int>, obj: Int) {
        if (stack.isEmpty()) {
            stack.push(obj)
            return
        }

        val boom = canCollide(stack.peek(), obj)
        if (boom) {
            val top = stack.peek()
            if (top + obj == 0) {
                stack.pop()
            }
            if (Math.abs(top) < Math.abs(obj)) {
                stack.pop()
                interact(stack, obj)
            } else {
                //actually ignore
            }
        } else {
            stack.push(obj)
        }
    }
}
