package over1000

class Solution1822 {
    fun arraySign(nums: IntArray): Int {
        var sign = 1
        for (i in nums) {
            if (i == 0) return 0

            if (i < 0) {
                sign *= -1
            }

        }
        return sign
    }

}
