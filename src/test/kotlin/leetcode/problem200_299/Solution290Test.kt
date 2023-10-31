package leetcode.problem200_299

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Solution290Test {

    @Test
    fun wordPattern() {
        val s = Solution290()
        assertFalse(s.wordPattern("abba", "dog dog dog dog"))
        assertTrue(s.wordPattern("abba", "dog cat cat dog"))
        assertFalse(s.wordPattern("abba", "dog cat cat fish"))
        assertFalse(s.wordPattern("aaaa", "dog cat cat dog"))
    }
}