package before100

class Solution26 {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0;

        var nextUniqIndex = 0;


        for (i in 1 until nums.size) {
            val current = nums[i - 1]
            val next = nums[i]
            val unique = current != next
            if (unique) {
                nextUniqIndex++
                nums[nextUniqIndex] = next
            }

        }

        return nextUniqIndex + 1
    }
}

fun main() {
    //add examples
    var arr = intArrayOf(1, 1, 2)
    var ans = Solution26().removeDuplicates(arr)
    println("${arr.toList()} $ans")

    arr = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    ans = Solution26().removeDuplicates(arr)
    println("${arr.toList()} $ans")
}
