package before1000

class Solution190 {

    fun reverseBits(n: Int): Int {
        var ans = 0
        var current = n

//        //get first bit
//        while (ans == 0 && current != 0) {
//            val last = current and 1
//            ans = last
//            current = current shr 1
//        }

        for (i in 0..31) {
            ans = ans shl 1
            ans = ans or (current and 1)
            current = current shr 1
        }

        return ans
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add example
            val s = Solution190()
            println(s.reverseBits(4))
        }
    }
}
