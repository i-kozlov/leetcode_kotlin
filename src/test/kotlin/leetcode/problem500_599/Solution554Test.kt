package leetcode.problem500_599

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Solution554Test {

    @Test
    fun leastBricks() {
        val s = Solution554()

        //use multiple asserts each on new line
        assertEquals(
            2,
            s.leastBricks(
                listOf(
                    listOf(1, 2, 2, 1),
                    listOf(3, 1, 2),
                    listOf(1, 3, 2),
                    listOf(2, 4),
                    listOf(3, 1, 2),
                    listOf(1, 3, 1, 1)
                )
            )
        )
        assertEquals(3, s.leastBricks(listOf(listOf(1), listOf(1), listOf(1))))
        assertEquals(0, s.leastBricks(listOf(listOf(1, 1), listOf(2), listOf(1, 1))))
        assertEquals(0, s.leastBricks(listOf(listOf(1, 1), listOf(2), listOf(1, 1), listOf(1, 1))))
        assertEquals(0, s.leastBricks(listOf(listOf(1, 1), listOf(2), listOf(1, 1), listOf(1, 1), listOf(1, 1))))
        assertEquals(
            0,
            s.leastBricks(listOf(listOf(1, 1), listOf(2), listOf(1, 1), listOf(1, 1), listOf(1, 1), listOf(1, 1)))
        )
        assertEquals(
            0,
            s.leastBricks(
                listOf(
                    listOf(1, 1),
                    listOf(2),
                    listOf(1, 1),
                    listOf(1, 1),
                    listOf(1, 1),
                    listOf(1, 1),
                    listOf(1, 1)
                )
            )
        )


    }
}