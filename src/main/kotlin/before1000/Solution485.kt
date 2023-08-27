package before1000

class Solution485 {

    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var globalMax = 0
        var currentMax = 0
        for(n in nums){
            if(n == 1){
                currentMax++
            } else {
                globalMax = Math.max(globalMax, currentMax)
                currentMax = 0

            }

        }
        return Math.max(globalMax, currentMax)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add example
        }
    }
}
