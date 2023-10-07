package leetcode.problem100_199

class Solution125 {
    fun isPalindrome1(s: String): Boolean {
        val normalized = s.filter { it.isLetterOrDigit() }.toLowerCase()
        return normalized == normalized.reversed()
    }

    fun isPalindrome(s: String): Boolean {
        val normalized = s.filter { it.isLetterOrDigit() }.toLowerCase()
        var (left, right) = 0 to normalized.lastIndex
        while (left < right) {
            if (normalized[left] != normalized[right]) return false
            left++
            right--
        }

        return true
    }
}
