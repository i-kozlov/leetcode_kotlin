package leetcode.problem301_399

class Solution389 {

    fun findTheDifference(s: String, t: String): Char {
        val s1 = s.toCharArray()
        s1.sort()
        val t1 = t.toCharArray()
        t1.sort()

        var i = 0
        while(i < s1.size){
            if(s1[i] != t1[i]) {
                return  t1[i]
            }
            i++
        }

        return t1[i]

    }
}
