package before100

class Solution27 {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        if (nums.isEmpty()) {
            return 0;
        }

        var insertIndex = 0
        nums.indices.forEach {
            if (nums[it] != `val`) {
                nums[insertIndex++] = nums[it]
            }

        }

//        for (i in insertIndex until nums.size) {
//            nums[i] = 0
//        }

        return insertIndex

    }
}

fun main() {
    var arr: IntArray
    var ans = 0

    arr = intArrayOf(3, 2, 2, 3)
    ans = Solution27().removeElement(arr, 3)
    println("${arr.toList()} $ans")

    arr = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
    ans = Solution27().removeElement(arr, 2)
    println("${arr.toList()} $ans")

}
