package over1000

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Solution2483Test {

    @Test
    fun bestClosingTime() {
        val s = Solution2483()
        assertEquals(0, s.bestClosingTime("NNNYNN"))
        assertEquals(4, s.bestClosingTime("YYYY"))
        assertEquals(2, s.bestClosingTime("YYNY"))

    }
}