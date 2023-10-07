package leetcode.problem301_399

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Solution389Test {

    @Test
    fun findTheDifference() {
        val solution389 = Solution389()
        assertEquals('a', solution389.findTheDifference("ae", "aea"))
        assertEquals('e', solution389.findTheDifference("abcd", "abcde"))
        assertEquals('y', solution389.findTheDifference("", "y"))
        assertEquals('a', solution389.findTheDifference("a", "aa"))
    }
}