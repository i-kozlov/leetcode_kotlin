package over1000

class Solution1679 {
    fun maxOperations(nums: IntArray, k: Int): Int {
        val complementaryMap = mutableMapOf<Int, Int>()
        var operations = 0

        for (i in nums.indices) {
            val num = nums[i]
            val second = k - num
            val complementaryCount: Int = complementaryMap.getOrDefault(second, 0)
            if (complementaryCount > 0) {
                //drop both number
                complementaryMap[second] = complementaryCount - 1
                operations++
            } else {
                //increment this number
                complementaryMap.computeIfAbsent(num) { _ -> 0 }
                complementaryMap[num] = complementaryMap[num]!! + 1
            }

        }

        return operations

    }

}
