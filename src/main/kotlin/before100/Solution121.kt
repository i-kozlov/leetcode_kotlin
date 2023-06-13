package before100

import other.TreeNode

class Solution121 {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var maxPrice = prices.last()

        for (i in prices.size - 2 downTo 0) {
            val dayPrice = prices[i]
            maxProfit = maxOf(maxProfit, maxPrice - dayPrice)
            maxPrice = maxOf(maxPrice, dayPrice)
        }

        return maxProfit
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add example
            //Input: prices = [7,1,5,3,6,4]
            //Output: 5
            //Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.

            println(Solution121().maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))

            //Input: prices = [7,6,4,3,1]
            //Output: 0
            //Explanation: In this case, no transactions are done and the max profit = 0.
            println(Solution121().maxProfit(intArrayOf(7, 6, 5, 4, 3, 2, 1)))


        }
    }
}
