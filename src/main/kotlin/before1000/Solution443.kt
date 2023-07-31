package before1000

import other.TreeNode

class Solution443 {
    fun compress(chars: CharArray): Int {

        var c = chars[0]
        var count = 1
        var writeIndex = 0

        for (i in 1 until chars.size) {
            val next = chars[i]
            if (next == c) {
                count++
            } else if (count == 1) {

                chars[writeIndex++] = c
                c = next
            } else {
                chars[writeIndex++] = c
                val digits = toChar(count)
                digits.forEach {
                    chars[writeIndex++] = it.first()
                }
                c = next
                count = 1
            }
        }

        if (count == 1) {
            chars[writeIndex++] = c
        } else {
            chars[writeIndex++] = c
            val digits = toChar(count)
            digits.forEach {
                chars[writeIndex++] = it.first()
            }
        }


        return writeIndex
    }

    private fun toChar(x: Int): List<String> {
        val l = mutableListOf<String>()
        var n = x
        while (n > 0) {
            l.add(((n % 10).toString()))
            n /= 10
        }
        return l.reversed()

    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add example

            val chars = charArrayOf('a','a','b','b','c','c','c')
            println(Solution443().compress(chars))
            println(chars.toList())
        }
    }
}
