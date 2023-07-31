package before100

class Solution9 {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        var (left, right) = x to x
        var length = x.toString().length
        val maxLength = length

        while (maxLength / 2 < length) {
            val dLeft = Math.pow(10.0, (length - 1).toDouble()).toInt()
            val (l, r) = left / dLeft to right % 10
            if (l != r) return false
            left %= dLeft
            right /= 10
            length--
        }


        return true
    }


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add example

            println(Solution9().isPalindrome(101))
            println(Solution9().isPalindrome(10))
        }
    }
}
