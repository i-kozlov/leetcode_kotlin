package leetcode.problem200_299

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Solution205Test {

    @Test
    fun isIsomorphic() {
        val solution = Solution205()
        assertFalse(solution.isIsomorphic("bbbaaaba", "aaabbbba"))
        assertTrue(solution.isIsomorphic("egg", "add"))
        assertFalse(solution.isIsomorphic("foo", "bar"))
        assertTrue(solution.isIsomorphic("paper", "title"))
        assertFalse(solution.isIsomorphic("ab", "aa"))

    }
}