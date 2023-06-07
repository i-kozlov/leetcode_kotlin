package before100

import java.util.Stack

class Solution22 {
    fun generateParenthesis_v1(n: Int): List<String> {

        return genRecursive(n, listOf("")).sorted()
    }

    private fun genRecursive(n: Int, prevSolution: List<String>): List<String> {
        if(n == 0) return prevSolution
        val newSolution = mutableSetOf<String>()
        prevSolution.forEach { s->
            newSolution.add("($s)")
            newSolution.add("()$s")
            newSolution.add("$s()")
        }
        return genRecursive(n - 1, newSolution.toList())
    }

    fun generateParenthesis(n: Int): List<String> {
        val open = Stack<String>()
        val close = Stack<String>()
        repeat(n) {
            open.push("(")
            close.push(")")
        }
        val result = mutableListOf<String>()
        return genRecursive2(open, close, "", result)


    }

    private fun genRecursive2(open: Stack<String>, close: Stack<String>, s: String, result: MutableList<String>): MutableList<String> {
        if(open.isEmpty() && close.isEmpty()){
            result.add(s)
            return result
        }
        if(open.size > close.size) return result

        //left
        if(open.isNotEmpty()){
            val newOpen = open.clone() as Stack<String>
            newOpen.pop()
            genRecursive2(newOpen, close, "$s(", result)
        }
        //right
        if(close.isNotEmpty() && close.size > open.size){
            val newClose = close.clone() as Stack<String>
            newClose.pop()
            genRecursive2(open, newClose, "$s)", result)
        }

        return result
    }
}

fun main() {
    println(Solution22().generateParenthesis(1))
    println(Solution22().generateParenthesis(2))
    println(Solution22().generateParenthesis(3))
}
