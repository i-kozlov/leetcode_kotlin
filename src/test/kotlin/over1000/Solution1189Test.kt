package over1000

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Solution1189Test {

    @Test
    fun maxNumberOfBalloons() {
        val s = Solution1189()
        assertEquals(0, s.maxNumberOfBalloons("balon"))
        assertEquals(1, s.maxNumberOfBalloons("nlaebolko"))
        assertEquals(2, s.maxNumberOfBalloons("loonbalxballpoon"))
        assertEquals(0, s.maxNumberOfBalloons("leetcode"))
    }
}