package leetcode.problem100_199

class Solution151 {

    fun reverseWords(s: String): String {
        return s
            .trim()
            .split("\\s+".toRegex())
            .reversed()
            .joinToString(" ")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add example
            println(Solution151().reverseWords("the sky is blue"))

        }
    }
}
