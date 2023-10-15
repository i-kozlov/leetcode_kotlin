package over1000

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Solution2390Test {

    @Test
    fun removeStars() {
        val solution2390 = Solution2390()

        assertEquals("lecoe", solution2390.removeStars("leet**cod*e"))
        assertEquals("", solution2390.removeStars("erase*****"))
        assertEquals("ababababab", solution2390.removeStars("ababababab"))
        assertEquals("ababababa", solution2390.removeStars("ababababab*"))
        assertEquals("ababababab", solution2390.removeStars("*ababababab"))

    }
}