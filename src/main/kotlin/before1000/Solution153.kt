///https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
class Solution153 {

    fun findMin(nums: IntArray): Int {
        if(nums.size == 1) return nums[0]
        var (left, right) = 0 to nums.lastIndex
        var mid = 0
        while (left <= right) {
            mid = (left + right) / 2
            if (mid + 1 < nums.lastIndex && nums[mid] > nums[mid + 1]) {
                //found min and max
                return nums[mid + 1]
            } else if(mid - 1 >= 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid]
            }
            else {
                if (nums[mid] < nums[left]) {
                    right = mid - 1
                } else {
                    left = mid + 1
                }

            }
        }

        return nums[mid]
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val ans6 = Solution153().findMin(intArrayOf(5, 6))
            println(ans6)
            //add example
            val ans = Solution153().findMin(intArrayOf(3, 4, 5, 1, 2))
            println(ans)

            //add more examples for 4,5,6,7,0,1,2
            val ans2 = Solution153().findMin(intArrayOf(4, 5, 6, 7, 0, 1, 2))
            println(ans2)

            val ans3 = Solution153().findMin(intArrayOf(1))
            println(ans3)

            val ans4 = Solution153().findMin(intArrayOf(1, 2))
            println(ans4)

            val ans5 = Solution153().findMin(intArrayOf(2, 1))
            println(ans5)



        }
    }
}
