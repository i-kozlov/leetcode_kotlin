package leetcode.problem301_399

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Solution345Test {

    @Test
    fun reverseVowels() {
        val solution345 = Solution345()

        assertEquals("holle", solution345.reverseVowels("hello"))
        assertEquals("leotcede", solution345.reverseVowels("leetcode"))
        assertEquals("Aa", solution345.reverseVowels("aA"))
    }
}