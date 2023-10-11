package leetcode.problem001_099

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Solution34Test {

    @Test
    fun searchRange() {

        val s = Solution34()
        assertArrayEquals(intArrayOf(0, 0), s.searchRange(intArrayOf(1, 2, 3), 1))
        assertArrayEquals(intArrayOf(0, 0), s.searchRange(intArrayOf(1), 1))
        assertArrayEquals(intArrayOf(3, 4), s.searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 8))
        assertArrayEquals(intArrayOf(-1, -1), s.searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 6))
    }
}