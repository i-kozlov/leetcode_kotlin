package before100

//https://leetcode.com/problems/climbing-stairs/
class Solution50 {
    fun climbStairs(n: Int): Int {
        if(n <= 2) return n

        var minus1 = 1
        var minus2 = 2
        var i = 2
        while (i++ < n){
            val temp = minus2
            minus2 = minus1 + minus2
            minus1 = temp
        }

        return  minus2
    }
}
