package leetcode.problem601_699

class Solution649 {
    fun predictPartyVictory(senate: String): String {
        val chars = senate.toCharArray()

        var R = 0
        var D = 0
        val first = if (senate[0] == 'D') "Dire" else "Radiant"

        while (!isOnePartyRemained(chars)) {
            for (i in 0..chars.size - 1) {
                val c = chars[i]
                if (c == 'D') {
                    if (R > 0) {
                        R-- //voice it used to ban
                        chars[i] = 'B'//banned
                    } else {
                        D++
                    }
                } else if (c == 'R') {
                    if (D > 0) {
                        D--//voice it used to ban
                        chars[i] = 'B'//banned
                    } else {
                        R++
                    }
                }
            }
        }
        val char = chars.find { it != 'B' }

        return if (char == 'D') "Dire" else "Radiant"
    }

    private fun isOnePartyRemained(chars: CharArray): Boolean {
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
