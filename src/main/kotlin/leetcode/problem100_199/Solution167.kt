package leetcode.problem100_199

class Solution167 {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var (left, right) = 0 to numbers.lastIndex
        while (left < right) {
            val sum = numbers[left] + numbers[right]
            when {
                sum == target -> return intArrayOf(left + 1, right + 1)
                sum < target -> left++
                else -> right--
            }
        }

        return intArrayOf()
    }
}
