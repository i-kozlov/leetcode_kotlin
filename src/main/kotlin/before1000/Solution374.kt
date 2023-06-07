class Solution374 {

     fun guessNumber(n:Int):Int {
        var left = 1
        var right = n
        while (left <= right) {
            val mid = left + (right - left) / 2
            val guess = guess(mid)
            if (guess == 0) {
                return mid
            } else if (guess < 0) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        return -1

    }

    fun guess(num:Int):Int {
        return 32 compareTo num
    }

    companion object {
        @JvmStatic fun main(args : Array<String>) {
            println("Hello, world!")
        }
    }
}
