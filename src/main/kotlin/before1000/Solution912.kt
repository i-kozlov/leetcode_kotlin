class Solution912 {
    fun sortArray(nums: IntArray): IntArray {
        for (i in 1 .. nums.lastIndex) {
            var j = i - 1
            while (j >= 0 && nums[j] > nums[j + 1]) {
                //swap
                val temp = nums[j + 1]
                nums[j + 1] = nums[j]
                nums[j] = temp
                j--
            }

        }
        return nums
    }
}

fun main() {

    var a = Solution912().sortArray(intArrayOf(5, 2, 3, 1))
    println(a.contentToString())
}