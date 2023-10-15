package over1000

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Solution1207Test {

    @Test
    fun uniqueOccurrences() {
        val solution1207 = Solution1207()

        assertTrue(solution1207.uniqueOccurrences(intArrayOf(1, 2, 2, 1, 1, 3)))
        assertFalse(solution1207.uniqueOccurrences(intArrayOf(1, 2)))
        assertTrue(solution1207.uniqueOccurrences(intArrayOf(-3, 0, 1, -3, 1, 1, 1, -3, 10, 0)))
    }
}