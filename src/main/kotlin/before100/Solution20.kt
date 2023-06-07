package before100

import java.util.*

class Solution20 {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        val mapping = mapOf(')' to '(', '}' to '{', ']' to '[')
        for (c in s) {
            val openBracket = mapping[c] == null
            if(openBracket){
                stack.push(c)
            } else {
                if(stack.isEmpty() || stack.pop() != mapping[c]){
                    return false
                }
            }
        }

        return stack.isEmpty()
    }
}
