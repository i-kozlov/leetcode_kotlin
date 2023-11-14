package over1000

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Solution1921Test {

    @Test
    fun eliminateMaximum() {

        val solution = Solution1921()

        assertEquals(1, solution.eliminateMaximum(intArrayOf(1, 1, 2, 3), intArrayOf(1, 1, 1, 1)))
        assertEquals(3, solution.eliminateMaximum(intArrayOf(4, 2, 3), intArrayOf(2, 1, 1)))

        assertEquals(3, solution.eliminateMaximum(intArrayOf(1, 3, 4), intArrayOf(1, 1, 1)))
        assertEquals(1, solution.eliminateMaximum(intArrayOf(3, 2, 4), intArrayOf(5, 3, 2)))
        assertEquals(1, solution.eliminateMaximum(intArrayOf(1, 1, 2, 3), intArrayOf(1, 1, 1, 1)))

        assertEquals(
            7,
            solution.eliminateMaximum(
                intArrayOf(7, 7, 8, 7, 7, 14, 8, 6, 6, 15, 7),
                intArrayOf(1, 1, 2, 1, 1, 3, 2, 1, 1, 1, 1)
            )
        )
        assertEquals(1, solution.eliminateMaximum(intArrayOf(1, 1, 1, 1, 1), intArrayOf(1, 2, 2, 2, 2)))
        assertEquals(1, solution.eliminateMaximum(intArrayOf(1, 1, 1, 1, 1), intArrayOf(2, 2, 2, 2, 2)))

        assertEquals(3, solution.eliminateMaximum(intArrayOf(1, 3, 4), intArrayOf(1, 1, 2)))
        assertEquals(1, solution.eliminateMaximum(intArrayOf(1, 1, 1, 1, 1), intArrayOf(1, 1, 1, 1, 1)))
        assertEquals(1, solution.eliminateMaximum(intArrayOf(1, 1, 1, 1, 1), intArrayOf(1, 1, 1, 1, 2)))
        assertEquals(1, solution.eliminateMaximum(intArrayOf(1, 1, 1, 1, 1), intArrayOf(1, 1, 1, 2, 2)))
        assertEquals(1, solution.eliminateMaximum(intArrayOf(1, 1, 1, 1, 1), intArrayOf(1, 1, 2, 2, 2)))
        assertEquals(2, solution.eliminateMaximum(intArrayOf(3, 5, 7, 4, 5), intArrayOf(2, 3, 6, 3, 2)))


    }
}