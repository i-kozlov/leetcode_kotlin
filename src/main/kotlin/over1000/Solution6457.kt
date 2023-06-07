package s1000

class Solution6457 {
    fun removeTrailingZeros(num: String): String {

        var i = num.length - 1
        while (i >= 0 && num[i] == '0') {
            i--
        }

        return num.substring(0, i + 1)


    }
}

fun main() {
    val s = Solution6457()
    println(s.removeTrailingZeros("123000"))
    println(s.removeTrailingZeros("51230100"))
    println(s.removeTrailingZeros("051230100"))
    println(s.removeTrailingZeros("0"))
}
