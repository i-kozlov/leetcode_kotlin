//https://leetcode.com/problems/binary-search/description/
class Solution704 {

    fun search(nums: IntArray, target: Int): Int {
        var (left, right) = 0 to nums.lastIndex
        while (left <= right){
            val middle = (left + right) / 2
            if(nums[middle] == target) return middle
            else if(nums[middle] < target) left = middle + 1
            else right = middle - 1
        }

        return -1
    }
}

fun main() {
    var arr: IntArray
    var ans = 0

    arr = intArrayOf(-1,0,3,5,9,12)
    ans = Solution704().search(arr, 9)
    println("${arr.toList()} $ans")

    arr = intArrayOf(-1,0,3,5,9,12)
    ans = Solution704().search(arr, 2)
    println("${arr.toList()} $ans")

    arr = intArrayOf(5)
    ans = Solution704().search(arr, 5)
    println("${arr.toList()} $ans")

    arr = intArrayOf(5)
    ans = Solution704().search(arr, 6)
    println("${arr.toList()} $ans")

    arr = intArrayOf(2,5)
    ans = Solution704().search(arr, 5)
    println("${arr.toList()} $ans")

    arr = intArrayOf(2,5)
    ans = Solution704().search(arr, 2)
    println("${arr.toList()} $ans")

    arr = intArrayOf(2,5)
    ans = Solution704().search(arr, 1)
    println("${arr.toList()} $ans")

    arr = intArrayOf(2,5)
    ans = Solution704().search(arr, 6)
    println("${arr.toList()} $ans")

    arr = intArrayOf(2,5,8)
    ans = Solution704().search(arr, 5)
    println("${arr.toList()} $ans")

    arr = intArrayOf(2,5,8)
    ans = Solution704().search(arr, 2)
    println("${arr.toList()} $ans")

    arr = intArrayOf(2,5,8)
    ans = Solution704().search(arr, 8)
    println("${arr.toList()} $ans")

    arr = intArrayOf(2,5,8)
    ans = Solution704().search(arr, 1)
    println("${arr.toList()} $ans")

    arr = intArrayOf(2,5,8)
    ans = Solution704().search(arr, 6)
    println("${arr.toList()} $ans")

    arr = intArrayOf(2,5,8)
    ans = Solution704().search(arr, 9)
    println("${arr.toList()} $ans")

}