package over1000

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Solution2017Test {

    @Test
    fun gridGame() {
        val s = Solution2017()

        assertEquals(
            63, s.gridGame(
                arrayOf(
                    intArrayOf(20, 3, 20, 17, 2, 12, 15, 17, 4, 15),
                    intArrayOf(20, 10, 13, 14, 15, 5, 2, 3, 14, 3)
                )
            )
        )


        assertEquals(
            4, s.gridGame(
                arrayOf(
                    intArrayOf(2, 5, 4), intArrayOf(1, 5, 1)
                )
            )
        )
        assertEquals(
            4, s.gridGame(
                arrayOf(
                    intArrayOf(3, 3, 1), intArrayOf(8, 5, 2)
                )
            )
        )
        assertEquals(
            7, s.gridGame(
                arrayOf(
                    intArrayOf(1, 3, 1, 15), intArrayOf(1, 3, 3, 1)
                )
            )
        )
    }
}