package over1000

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Solution1679Test {

    @Test
    fun maxOperations() {
        assertEquals(2, Solution1679().maxOperations(intArrayOf(1, 1, 1, 2, 2, 2, 4, 4), 6))
        assertEquals(2, Solution1679().maxOperations(intArrayOf(1, 2, 3, 4), 5))
        assertEquals(1, Solution1679().maxOperations(intArrayOf(3, 1, 3, 4, 3), 6))
        assertEquals(2, Solution1679().maxOperations(intArrayOf(1, 2, 3, 4, 5), 5))

    }
}