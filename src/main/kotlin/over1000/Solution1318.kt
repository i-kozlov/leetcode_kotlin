package over1000

class Solution1318 {

    /**
     * Given 3 positives numbers a, b and c. Return the minimum flips required in some bits of a and b to make ( a OR b == c ). (bitwise OR operation).
     * Flip operation consists of change any single bit 1 to 0 or change the bit 0 to 1 in their binary representation.
     */
    fun minFlips_v1(a: Int, b: Int, c: Int): Int {

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


            when (targetChar) {
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

    fun minFlips(a: Int, b: Int, c: Int): Int {
        var flips = 0
        var a1 = a
        var b1 = b
        var c1 = c

        while (a1 > 0 || b1 > 0 || c1 > 0) {
            val aBit = a1 and 1
            val bBit = b1 and 1
            val cBit = c1 and 1

            when (cBit) {
                0 -> {
                    if (aBit == 1) flips++
                    if (bBit == 1) flips++
                }

                1 -> {
                    if (aBit == 0 && bBit == 0) flips++
                }
            }
            a1 = a1 shr 1
            b1 = b1 shr 1
            c1 = c1 shr 1
        }

        return flips
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //tests
            val s = Solution1318()
            println(s.minFlips(4, 2, 7) == 1)
            println(s.minFlips(2, 6, 5))
            println(s.minFlips(1, 2, 3))

        }
    }
}
