package s1000

class Solution6395 {
    fun buyChoco(prices: IntArray, money: Int): Int {
        if (prices.size < 2) return money

        prices.sort()

        val minSum = prices[0] + prices[1]
        return if (minSum > money) money else money - minSum

    }
}
