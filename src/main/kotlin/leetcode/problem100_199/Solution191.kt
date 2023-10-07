package leetcode.problem100_199

class Solution191 {

    //    191. Number of 1 Bits
// you need treat n as an unsigned value
    fun hammingWeight(n: Int): Int {
        var result = 0
        var current = n
        while (current != 0) {
            if (current and 1 == 1) {
                result++
            }
            current = current ushr 1
        }
        return result
    }


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add example
            val s = Solution191()
            println(s.hammingWeight(2))
            println(s.hammingWeight(3))
            println(s.hammingWeight(4))
            println(s.hammingWeight(5))
            println(s.hammingWeight(7))
            println(s.hammingWeight(11))
            println(s.hammingWeight(128))






        }
    }
}
