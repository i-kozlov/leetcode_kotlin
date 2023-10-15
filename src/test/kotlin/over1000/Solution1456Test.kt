package over1000

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Solution1456Test {

    @Test
    fun maxVowels() {
        val solution1456 = Solution1456()

        assertEquals(4, solution1456.maxVowels("weallloveyou", 7))
        assertEquals(2, solution1456.maxVowels("zpuerktejfp", 3))
        assertEquals(3, solution1456.maxVowels("abciiidef", 3))
        assertEquals(2, solution1456.maxVowels("aeiou", 2))
        assertEquals(2, solution1456.maxVowels("leetcode", 3))
        assertEquals(0, solution1456.maxVowels("rhythms", 4))
        assertEquals(1, solution1456.maxVowels("tryhard", 4))
    }
}