package leetcode.problem601_699

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Solution649Test {

    @Test
    fun predictPartyVictory() {

        val solution649 = Solution649()
        assertEquals("Dire", solution649.predictPartyVictory("DDRRR"))
        assertEquals("Radiant", solution649.predictPartyVictory("RD"))
        assertEquals("Dire", solution649.predictPartyVictory("RDD"))
        assertEquals("Radiant", solution649.predictPartyVictory("DRRDRDRDRDDRDRDR"))
        assertEquals("Radiant", solution649.predictPartyVictory("DRRDRDRDRDDRDRDR"))
        assertEquals("Radiant", solution649.predictPartyVictory("DRRDRDRDRDDRDRDR"))
        assertEquals("Radiant", solution649.predictPartyVictory("DRRDRDRDRDDRDRDR"))
        assertEquals("Radiant", solution649.predictPartyVictory("DRRDRDRDRDDRDRDR"))
        assertEquals("Radiant", solution649.predictPartyVictory("DRRDRDRDRDDRDRDR"))
        assertEquals("Radiant", solution649.predictPartyVictory("DRRDRDRDRDDRDRDR"))
        assertEquals("Radiant", solution649.predictPartyVictory("DRRDRDRDRDDRDRDR"))
        assertEquals("Radiant", solution649.predictPartyVictory("DRRDRDRDRDDRDRDR"))

    }
}