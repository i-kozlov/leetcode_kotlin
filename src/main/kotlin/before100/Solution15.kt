package before100

//https://leetcode.com/problems/3sum/
class Solution15 {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val targetSum = 0
        val results = mutableListOf<List<Int>>()
        val setOfResults = mutableSetOf<String>()
        val sorted = nums.sorted()
        for (i in 0..sorted.size - 3) {
            //also when first item is > 0 then it means we can't get sum == 0 as array is ascending
            if (sorted[i] > 0) break;

            //we have a target - 0. we are removing the first item a get
            val sumOf2and3 = targetSum - sorted[i]
            var (left, right) = i + 1 to sorted.lastIndex
            while (left < right) {
                val sum = sorted[left] + sorted[right]
                when {
                    sum == sumOf2and3 -> {

                        val list = listOf(sorted[i], sorted[left], sorted[right]).sorted()
                        if (setOfResults.add(list.joinToString(""))) {
                            results.add(list)
                        }
                        left++
                    }
                    sum < sumOf2and3 -> left++
                    else -> right--
                }
            }
        }

        return results
    }

}

fun main() {
    var a = Solution15().threeSum(intArrayOf(-2, 0, 1, 1, 2))
    println(a)

    a = Solution15().threeSum(intArrayOf(-1, 0, 1))
    println(a)

    a = Solution15().threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))
    println(a)
}
