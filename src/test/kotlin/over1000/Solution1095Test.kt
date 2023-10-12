package over1000

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Solution1095Test {

    @Test
    fun findInMountainArray() {
        //add test
        val s = Solution1095()
        assertEquals(-1, s.findInMountainArray(0, Solution1095.MountainArray(intArrayOf(1, 2, 3, 5, 3))))
        assertEquals(0, s.findInMountainArray(0, Solution1095.MountainArray(intArrayOf(0, 5, 3, 1))))
        assertEquals(2, s.findInMountainArray(2, Solution1095.MountainArray(intArrayOf(1, 5, 2))))

    }
}