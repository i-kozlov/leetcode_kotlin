package leetcode.problem100_199

//https://leetcode.com/problems/evaluate-reverse-polish-notation/
class Solution150 {

    fun evalRPN(tokens: Array<String>): Int {
        val stack = java.util.Stack<Int>()
        tokens.forEach { t->
            when(t){
                "+" -> stack.push(stack.pop() + stack.pop())
                "*" -> stack.push(stack.pop() * stack.pop())
                "-" -> {
                    val a = stack.pop()
                    val b = stack.pop()
                    stack.push(b - a)
                }
                "/" -> {
                    val a = stack.pop()
                    val b = stack.pop()
                    stack.push(b / a)
                }
                else -> stack.push(t.toInt())
            }
        }

        return stack.pop()
    }
}

fun main() {
    println(Solution150().evalRPN(arrayOf("2", "1", "+", "3", "*")))
    println(Solution150().evalRPN(arrayOf("4", "13", "5", "/", "+")))
    println(Solution150().evalRPN(arrayOf("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+")))
}