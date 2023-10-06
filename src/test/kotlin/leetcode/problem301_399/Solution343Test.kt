package leetcode.problem301_399

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Solution343Test {

    @Test
    fun integerBreak() {
        val solution343 = Solution343()
        assertEquals(1, solution343.integerBreak(2))
        assertEquals(36, solution343.integerBreak(10))

    }
}