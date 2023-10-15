package over1000

class Solution2390 {
    fun removeStars(s: String): String {
        val chars = s.toCharArray()
        var startWith = 0
        while (s.indexOf('*', startWith) > -1) {
            var index = s.indexOf('*', startWith)
            startWith = index + 1
            if (index == 0) continue

            //replace item if it is not * otherwise replace the previous one
            while (index >= 0 && chars[index] == '*') {
                index--
            }
            if (index > -1)
                chars[index] = '*'
        }

        return chars.joinToString("").replace("*", "")
    }

}
