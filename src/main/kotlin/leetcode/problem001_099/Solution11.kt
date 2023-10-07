package before100

//https://leetcode.com/problems/container-with-most-water/
class Solution11 {
    fun maxArea(height: IntArray): Int {
        var (left, right) = 0 to height.lastIndex
        var maxArea = 0

        while (left< right){
            val hLeft = height[left]
            val hRight = height[right]
            val area = (right - left) * minOf(hLeft, hRight)
            maxArea = maxOf(maxArea, area)

            if(hLeft < hRight){
                left++
            } else {
                right--
            }
        }

        return maxArea

    }
}
