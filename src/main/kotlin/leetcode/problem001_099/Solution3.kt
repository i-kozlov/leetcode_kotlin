package leetcode.problem001_099

class Solution3 {

    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) return 0
        var max = 0
        var L = 0
        val map = HashMap<Char, Int>()

        var R = 0
        //can add extra condition when current possible max below maxLength
        while (R < s.length) {
            val c = s[R]
            val prevCharLocation = map.put(c, R)

            //repeated char
            if (prevCharLocation != null) {
                if (L <= prevCharLocation)
                    L = prevCharLocation + 1
            }
            max = maxOf(max, R - L + 1)
            R++
        }

        return max
    }
}
