class Solution238 {
    fun productExceptSelf(nums: IntArray): IntArray {
        val prefix = IntArray(nums.size)
        val postfix = IntArray(nums.size)

        nums.indices.forEach {
            val el = nums[it]
            prefix[it] = if (it == 0) el else prefix[it - 1] * el
        }

        nums.indices.reversed().forEach() {
            val el = nums[it]
            postfix[it] = if (it == nums.size - 1) el else postfix[it + 1] * el
        }

        fun getPrefix(i: Int) = if (i == 0) 1 else prefix[i - 1]
        fun getPostfix(i: Int) = if (i == nums.size - 1) 1 else postfix[i + 1]

        val result = IntArray(nums.size)
        nums.indices.forEach {
            result[it] = getPrefix(it) * getPostfix(it)
        }
        return result
    }
}

fun main() {
    val s = Solution238()
    println(s.productExceptSelf(intArrayOf(1, 2, 3, 4)).toList())
    println(s.productExceptSelf(intArrayOf(-1, 1, 0, -3, 3)).toList())
}
