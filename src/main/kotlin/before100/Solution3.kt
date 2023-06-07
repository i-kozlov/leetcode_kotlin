package before100

class Solution3 {

    fun lengthOfLongestSubstring(s: String): Int {
        if(s.isEmpty()) return 0
        val map = HashMap<Char, Int>()
        var maxLength = 0

        var currentLength = 0
        var i = 0
        //can add extra condition when current possible max below maxLength
        while (i < s.length) {
            val c = s[i]
            val prevCharLocation = map.put(s[i], i)
            val newInSeq = prevCharLocation == null
            if (newInSeq) {
                i++
                currentLength++
            } else {
                maxLength = maxOf(maxLength, currentLength)
                //do not increment i to start seq from same letter
//                i = prevCharLocation!! + 1
                currentLength = i - prevCharLocation!!
                i++
            }
        }

        return maxOf(maxLength, currentLength)
    }
}

fun main() {
    //add examples

    val s = Solution3()
    println(s.lengthOfLongestSubstring("abba"))
    println(s.lengthOfLongestSubstring("dvdf"))
    println(s.lengthOfLongestSubstring("abcabcbb"))
    println(s.lengthOfLongestSubstring("bbb"))
    println(s.lengthOfLongestSubstring("pwwkew"))

}