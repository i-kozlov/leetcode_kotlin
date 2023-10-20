package leetcode.problem601_699

import java.util.LinkedList

class Solution649 {
    fun predictPartyVictory(senate: String): String {
        val senatorsToVote = LinkedList<Char>()
        val currentVote = LinkedList<Char>()
        val nextVote = LinkedList<Char>()

        senate.forEach { senatorsToVote.add(it) }

        do {
            while (senatorsToVote.isNotEmpty()) {
                val party = senatorsToVote.removeFirst()
                //no one in queue or same party
                if (currentVote.isEmpty() || currentVote.peek() == party) {
                    currentVote.add(party)
                } else {
                    //different party
                    //ban current senator and mark one as voting in next session
                    nextVote.add(currentVote.poll())
                }
            }
            //fist moving current unused voices
            while (currentVote.isNotEmpty()) {
                senatorsToVote.add(currentVote.poll())
            }
            currentVote.forEach { senatorsToVote.add(it) }
            //the all unbanned
            while (nextVote.isNotEmpty()) {
                senatorsToVote.add(nextVote.poll())
            }
        } while (!isOnePartyRemained(senatorsToVote))

        return if (senatorsToVote.first == 'D') "Dire" else "Radiant"
    }

    private fun isOnePartyRemained(chars: List<Char>): Boolean {
        var R = 0
        var D = 0
        for (c in chars) {
            if (c == 'R') {
                R++
            } else if (c == 'D') {
                D++
            }
        }
        return R == 0 || D == 0
    }
}
