package leetcode.problem301_399

class Solution345 {

    fun reverseVowels(s: String): String {
        val arr = s.toCharArray()
        var (L, R) = 0 to s.length - 1
        val vowels = listOf('a', 'e', 'i', 'o', 'u')
        while (L < R) {
            while (L < R && s[L].toLowerCase() !in vowels) {
                L++
            }
            while (L < R && s[R].toLowerCase() !in vowels) {
                R--
            }
            val temp = s[L]
            arr[L] = s[R]
            arr[R] = temp

            L++
            R--
        }

        return arr.concatToString()
    }

}
