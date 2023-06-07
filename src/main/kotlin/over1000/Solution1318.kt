package over1000

class Solution1318 {

    fun minFlips(a: Int, b: Int, c: Int): Int {

        // c = 0 -> a = 0 && b = 0
        // c = 1 -> a = 1 || b = 0

        val a1 = Integer.toBinaryString(a)
        val b1 = Integer.toBinaryString(b)
        val c1 = Integer.toBinaryString(c)

        val maxLength = maxOf(a1.length, b1.length, c1.length)
        val a2: String = "0".repeat(maxLength - a1.length) + a1
        val b2 = "0".repeat(maxLength - b1.length) + b1
        val c2 = "0".repeat(maxLength - c1.length) + c1

        var flips = 0
        for (i in 0..maxLength - 1) {
            val targetChar = c2[i]
            val aChar = a2[i]
            val bChar = b2[i]


            when(targetChar) {
                '0' -> {
                    if (aChar == '1') flips++
                    if (bChar == '1') flips++
                }
                '1' -> {
                    if (aChar == '0' && bChar == '0') flips++
                }
            }

        }
        return flips
    }


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //tests
            val s = Solution1318()
            println(s.minFlips(2, 6, 5))
            println(s.minFlips(4, 2, 7))
            println(s.minFlips(1, 2, 3))

        }
    }
}
