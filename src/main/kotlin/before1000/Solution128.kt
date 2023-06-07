class Solution128 {
    fun longestConsecutive(nums: IntArray): Int {
        val set = nums.toSet()
//        val set = setOf<Int>(*nums.toTypedArray())

        var maxSize = 0

        set.forEach() {
            val isBeginning = !set.contains(it - 1)
            if (!isBeginning) {
                maxSize = maxOf(maxSize, 1)
                return@forEach
            }
            var num = it
            var size = 1
            while (set.contains(num + 1)) {
                num++
                size++
            }
            maxSize = maxOf(maxSize, size)
        }
        return maxSize
    }
}

fun main() {
    val s = Solution128()
    println(s.longestConsecutive(intArrayOf(100, 4, 200, 1, 3, 2)))
    println(s.longestConsecutive(intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1)))
    println(s.longestConsecutive(intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1, 9)))
    println(s.longestConsecutive(intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1, 9, 10)))
    println(s.longestConsecutive(intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1, 9, 10, 11)))
    println(s.longestConsecutive(intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1, 9, 10, 11, 12)))
    println(s.longestConsecutive(intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1, 9, 10, 11, 12, 13)))
    println(s.longestConsecutive(intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1, 9, 10, 11, 12, 13, 14)))
    println(s.longestConsecutive(intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1, 9, 10, 11, 12, 13, 14, 15)))
    println(s.longestConsecutive(intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1, 9, 10, 11, 12, 13, 14, 15, 16)))

}