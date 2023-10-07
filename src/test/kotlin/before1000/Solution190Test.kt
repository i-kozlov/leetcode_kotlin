package before1000

import leetcode.problem100_199.Solution190
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Solution190Test {

    @Test
    fun reverseBits() {
        val s = Solution190()

        assertEquals(0b00111001011110000010100101000000,
            s.reverseBits(0b00000010100101000001111010011100))
        assertEquals(964176192, s.reverseBits(43261596))
        //assertEquals(-1073741825, s.reverseBits(-3))

    }
    //add tests for a  Solution190 class

}