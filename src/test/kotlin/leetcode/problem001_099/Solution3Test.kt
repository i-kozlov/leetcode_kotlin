package leetcode.problem001_099

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Solution3Test {

    @Test
    fun lengthOfLongestSubstring() {
        val s = Solution3()

        assertEquals(3, s.lengthOfLongestSubstring("dvdf"))
        assertEquals(2, s.lengthOfLongestSubstring("abba"))
        assertEquals(3, s.lengthOfLongestSubstring("pwwkew"))
        assertEquals(3, s.lengthOfLongestSubstring("abcabcbb"))

    }
}