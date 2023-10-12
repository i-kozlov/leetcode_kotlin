package over1000

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Solution1822Test {

    @Test
    fun arraySign() {
        val solution1822 = Solution1822()

        assertEquals(1, solution1822.arraySign(intArrayOf(-1, -2, -3, -4, 3, 2, 1)))
        assertEquals(1, solution1822.arraySign(intArrayOf(1, 2, 3, 4, 5)))
        assertEquals(0, solution1822.arraySign(intArrayOf(0)))
        assertEquals(0, solution1822.arraySign(intArrayOf(1, 5, 0, 2, -3)))
        assertEquals(-1, solution1822.arraySign(intArrayOf(-3)))
    }
}