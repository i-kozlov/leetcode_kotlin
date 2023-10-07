package before100

class Solution14 {

    fun longestCommonPrefix(strs: Array<String>): String {
        if(strs.isEmpty()) return ""
        var prefix = ""
        val min = strs.map { it.length }.min()!!


        loop@for (i in 0 until min) {
            val expectedChar = strs[0][i]
            for (j in 0..strs.lastIndex) {
                val word = strs[j]
                val actualLetter = word[i]
                if (actualLetter != expectedChar) break@loop
            }
            prefix += expectedChar
        }

        return prefix
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add examples
            println(Solution14().longestCommonPrefix(arrayOf("flower", "flow", "flight")))
            println(Solution14().longestCommonPrefix(arrayOf("dog", "racecar", "car")))

        }
    }
}
