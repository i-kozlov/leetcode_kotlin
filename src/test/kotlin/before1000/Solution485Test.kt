package before1000

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Solution485Test {

    @Test
    fun findMaxConsecutiveOnes() {
        val sol = Solution485()

        assertEquals(3, sol.findMaxConsecutiveOnes(intArrayOf(1,1,0,1,1,1)))
        assertEquals(2, sol.findMaxConsecutiveOnes(intArrayOf(1,0,1,1,0,1)))
    }
    @Test
    fun testEdgeCases() {
        val sol = Solution485()
        assertEquals(0, sol.findMaxConsecutiveOnes(intArrayOf(0)))
        assertEquals(1, sol.findMaxConsecutiveOnes(intArrayOf(1)))
        assertEquals(0, sol.findMaxConsecutiveOnes(intArrayOf()))
    }
}