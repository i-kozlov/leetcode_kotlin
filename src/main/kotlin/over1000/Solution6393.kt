package s1000

//Maximum Strength of a Group
class Solution6393 {
    fun maxStrength(nums: IntArray): Long {
        var product = 1L
        var productNegative = 1L
        var devisor = -11

        var hasZero = false
        var hasPositive = false
        var negativeCount = 0

        nums.forEach {
            if (it != 0) {

                if (it < 0) {
                    devisor = maxOf(devisor, it)
                    productNegative *= it
                    negativeCount++
                } else {
                    product *= it
                    hasPositive = true
                }
            } else {
                hasZero = true
            }
        }

        if (productNegative < 0 && negativeCount > 1) {
            productNegative = productNegative / devisor
        }

        return when {
            hasPositive -> {
                if (productNegative > 0) {
                    product * productNegative
                } else {
                    product
                }
            }

            hasZero -> {
                if (productNegative > 0 && negativeCount > 1) {
                    productNegative
                } else {
                    0
                }
            }

            else -> {
                productNegative
            }
        }

    }


    fun maxStrength2(nums: IntArray): Int {
        val n = nums.size
        var maxStrength = Int.MIN_VALUE
        var currentMax = 1
        var currentMin = 1

        for (i in 0 until n) {
            val num = nums[i]
            if (num == 0) {
                currentMax = 1
                currentMin = 1
                maxStrength = maxOf(maxStrength, 0)
            } else if (num > 0) {
                currentMax *= num
                currentMin = minOf(currentMin * num, 1)
                maxStrength = maxOf(maxStrength, currentMax)
            } else {
                val temp = currentMax
                currentMax = maxOf(currentMin * num, 1)
                currentMin = temp * num
                maxStrength = maxOf(maxStrength, currentMax)
            }
        }

        return maxStrength
    }

}

fun main() {
    //add examples
    var ans = Solution6393().maxStrength(intArrayOf(3, -1, -5, 2, 5, -9))
    var ans2 = Solution6393().maxStrength2(intArrayOf(3, -1, -5, 2, 5, -9))
    println(ans)
    println(ans2)

    ans = Solution6393().maxStrength(intArrayOf(4, -5, -4))
    println(ans)
    ans = Solution6393().maxStrength2(intArrayOf(4, -5, -4)).toLong()
    println(ans)

    ans = Solution6393().maxStrength(intArrayOf(0, -1))
    println(ans)
    ans = Solution6393().maxStrength2(intArrayOf(0, -1)).toLong()
    println(ans)

    ans = Solution6393().maxStrength(intArrayOf(2, 2, 7, 0, -4, 9, 4))
    println(ans)
    ans = Solution6393().maxStrength2(intArrayOf(2, 2, 7, 0, -4, 9, 4)).toLong()
    println(ans)

    ans = Solution6393().maxStrength(intArrayOf(-3))
    println(ans)
    ans = Solution6393().maxStrength2(intArrayOf(-3)).toLong()
    println(ans)
}