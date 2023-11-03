package leetcode.problem001_099

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Solution12Test {

    @Test
    fun intToRoman() {
        val solution = Solution12()
        assertEquals("LVIII", solution.intToRoman(58))
        assertEquals("MCMXCIV", solution.intToRoman(1994))
        assertEquals("III", solution.intToRoman(3))
        assertEquals("IV", solution.intToRoman(4))
        assertEquals("IX", solution.intToRoman(9))
    }
}