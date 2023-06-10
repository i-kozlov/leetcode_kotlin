package over1000

import other.TreeNode

class Solution6425 {


    fun longestSemiRepetitiveSubstring(s: String): Int {
        var (L, R) = (0 to 0)
        val window = mutableSetOf<Char>()
        var maxSize = 0
        var currentSize = 0
        var hasDuplicate = false
        var duplicatePosition = 0

        while (R < s.length) {
            if (window.add(s[R])) {
                currentSize++

            } else if (hasDuplicate) {
                //if repeated
                while (L <= duplicatePosition) {
                    window.remove(s[L])
                    currentSize--
                    L++
                }
                hasDuplicate = false
                R = L

            } else {
                hasDuplicate = true
                duplicatePosition = R
                currentSize++
            }

            maxSize = maxOf(maxSize, currentSize)
            R++
        }

        return maxSize
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add example
            val s = Solution6425()
            println(s.longestSemiRepetitiveSubstring("1111111"))
            println(s.longestSemiRepetitiveSubstring("52233"))
            println(s.longestSemiRepetitiveSubstring("5494"))

        }
    }
}
