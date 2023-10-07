package leetcode.problem001_099

import before100.Solution62
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Solution62Test {

    @Test
    fun uniquePaths() {
        val s = Solution62()
        assertEquals(28, s.uniquePaths(3, 7))
        assertEquals(3, s.uniquePaths(3, 2))

    }

    @Test
    fun uniquePaths2() {
        val s = Solution62()
        assertEquals(28, s.uniquePaths2(3, 7))
        assertEquals(3, s.uniquePaths2(3, 2))

    }

}