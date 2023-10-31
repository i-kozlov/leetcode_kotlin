package leetcode.problem200_299

import other.TreeNode

class Solution290 {

    fun wordPattern(pattern: String, s: String): Boolean {
        val words = s.split(" ")
        if(pattern.length != words.size) return false

        val map = HashMap<Char, String>()
        val reverseMap = HashMap<String, Char>()
        for(i in 0.. pattern.length - 1){
            val c = pattern[i]
            val w = words[i]
            val mappedWord = map[c]
            val mappedChar = reverseMap[w]
            if(mappedWord == null && mappedChar == null){
                map[c] = w
                reverseMap[w] = c
            } else if(mappedWord != w || mappedChar != c){
                return false
            }

        }

        return true
    }
}
