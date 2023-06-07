package before100

class Solution53 {
    fun maxSubArray(nums: IntArray): Int {
        if(nums.isEmpty()) return 0
        if(nums.size == 1) return nums[0]
        var maxSum = Int.MIN_VALUE
        var currSum = 0
        var lengthForLargestSum = 0
        var currentLength = 0

        for (x in nums) {
            currSum += x
            currentLength++

            if (currSum >= maxSum) {
                lengthForLargestSum = currentLength
                maxSum = currSum
            }

            if (currSum < 0) {
                currentLength = 0
                currSum = 0
            }


        }


        return maxSum
    }
}

fun main() {
    //add test cases
    val s = Solution53()
    println(s.maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
    println(s.maxSubArray(intArrayOf(1)))
    println(s.maxSubArray(intArrayOf(0)))
    println(s.maxSubArray(intArrayOf(-1)))
    println(s.maxSubArray(intArrayOf(-2147483647)))
}