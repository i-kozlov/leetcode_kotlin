package before100

class Solution1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        nums.indices.forEach { idx ->
            val num = nums[idx]
            val remain = target - num

            if (map.contains(remain)) {
                return intArrayOf(idx, map[remain]!!)
            } else {
                map[num] = idx
            }

        }

        return intArrayOf()
    }
}
