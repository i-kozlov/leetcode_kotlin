//https://leetcode.com/problems/koko-eating-bananas/
class Solution875 {

    fun minEatingSpeed(piles: IntArray, h: Int): Int {
//        if (piles.size == h) return piles.max()

        var minSpeed = piles.max()!!

        //possible speed interval from min to max
        var (left, right) = (1 to minSpeed)
        var mid = left
        while (left <= right) {
            mid = (left + right) / 2
//          need to roundUp time
            val timeToEatWith = piles.map { Math.ceil(it.toDouble() / mid).toLong() }.sum()
            if (timeToEatWith <= h) {
                right = mid - 1
                minSpeed = minOf(minSpeed, mid)
            } else {
                //speed is too slow
                left = mid + 1
            }
        }


        return minSpeed

    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            var ans4 = 0
            ans4 = Solution875().minEatingSpeed(intArrayOf(805306368, 805306368, 805306368), 1000000000)
            println("${ans4 == 3}  $ans4")

            ans4 = Solution875().minEatingSpeed(intArrayOf(1, 1, 1, 999999999), 10)
            println("${ans4 == 142857143}  $ans4")

            ans4 = Solution875().minEatingSpeed(intArrayOf(312884470), 312884469)
            println("${ans4 == 2}  $ans4")


            val ans3 = Solution875().minEatingSpeed(intArrayOf(30, 11, 23, 4, 20), 6)
            println("${ans3 == 23}  $ans3")

            //add an example
            val ans = Solution875().minEatingSpeed(intArrayOf(3, 6, 7, 11), 8)
            println("${ans == 4}  $ans")

            val ans2 = Solution875().minEatingSpeed(intArrayOf(30, 11, 23, 4, 20), 5)
            println("${ans2 == 30}  $ans2")


        }
    }
}
