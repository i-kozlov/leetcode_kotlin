package leetcode.problem400_499

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Solution459Test {

    @Test
    fun repeatedSubstringPattern() {
        val solution459 = Solution459()

        assertTrue(solution459.repeatedSubstringPattern("babbabbabbabbab"))
        assertTrue(solution459.repeatedSubstringPattern("ababababab"))
        assertTrue(solution459.repeatedSubstringPattern("abababababab"))
        assertTrue(solution459.repeatedSubstringPattern("ababababababab"))
        assertTrue(solution459.repeatedSubstringPattern("abababababababab"))
        assertTrue(solution459.repeatedSubstringPattern("ababababababababab"))
        assertTrue(solution459.repeatedSubstringPattern("abab"))
        assertFalse(solution459.repeatedSubstringPattern("aba"))
        assertTrue(solution459.repeatedSubstringPattern("abcabcabcabc"))
        assertTrue(solution459.repeatedSubstringPattern("ababab"))
        assertTrue(solution459.repeatedSubstringPattern("abababab"))
    }
}