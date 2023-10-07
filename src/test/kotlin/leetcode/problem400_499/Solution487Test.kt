package leetcode.problem400_499

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Solution487Test {

    @Test
    fun findMaxConsecutiveOnes() {
        val sol = Solution487()

        assertEquals(4, sol.findMaxConsecutiveOnes(intArrayOf(1,0,1,1,0,1)))

        assertEquals(6, sol.findMaxConsecutiveOnes(intArrayOf(1,1,0,1,1,1)))
        assertEquals(4, sol.findMaxConsecutiveOnes(intArrayOf(1,0,1,1,0)))
    }

    @Test
    fun testEdgeCases() {
        val sol = Solution487()
        assertEquals(1, sol.findMaxConsecutiveOnes(intArrayOf(0)))
        assertEquals(1, sol.findMaxConsecutiveOnes(intArrayOf(1)))
        assertEquals(0, sol.findMaxConsecutiveOnes(intArrayOf()))
    }

    @Test
    fun testFindMaxConsecutiveOnes2() {
        val sol = Solution487()
        assertEquals(4, sol.findMaxConsecutiveOnes2(intArrayOf(1,0,1,1,0,1)))

        assertEquals(6, sol.findMaxConsecutiveOnes2(intArrayOf(1,1,0,1,1,1)))
        assertEquals(4, sol.findMaxConsecutiveOnes2(intArrayOf(1,0,1,1,0)))
    }

    @Test
    fun testEdgeCases2() {
        val sol = Solution487()
        assertEquals(1, sol.findMaxConsecutiveOnes2(intArrayOf(0)))
        assertEquals(1, sol.findMaxConsecutiveOnes2(intArrayOf(1)))
        assertEquals(0, sol.findMaxConsecutiveOnes2(intArrayOf()))
    }
}