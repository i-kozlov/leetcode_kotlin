package before1000

class Solution338 {

    fun countBits(n: Int): IntArray {
        val arr = IntArray(n + 1)
        for (i in 0..n)
            arr[i] = hammingWeight(i)

        return arr
    }

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
            val s = Solution338()
            println(s.countBits(2).joinToString(","))
            println(s.countBits(5).joinToString(","))


        }
    }
}
