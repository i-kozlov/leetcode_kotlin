package leetcode.problem1000_1099

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Solution1004Test {

    @Test
    fun longestOnes() {
        //
        val sol = Solution1004()
        assertEquals(4, sol.longestOnes(intArrayOf(1,1,1,0,0,0,1,1,1,1), 0), )
        assertEquals(4, sol.longestOnes(intArrayOf(0,0,0,1), 4), )
        assertEquals(6, sol.longestOnes(intArrayOf(1,1,1,0,0,0,1,1,1,1,0), 2), )
        assertEquals(10, sol.longestOnes(intArrayOf(0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1), 3), )
    }
}