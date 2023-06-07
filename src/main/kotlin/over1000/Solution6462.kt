package s1000

import other.TreeNode
//todo - revisit
//https://leetcode.com/contest/weekly-contest-348/problems/minimize-string-length/
class Solution6462 {

    fun minimizedStringLength2(s: String): Int {
        val frequencies = s.groupingBy { it }.eachCount()
        return frequencies.keys.size
    }
    fun minimizedStringLength(s: String): Int {
        val map = mutableMapOf<Char, Int>()
        for (c in s) {
            map[c] = map.getOrDefault(c, 0) + 1
        }

        val list = mutableListOf<Pair<Char, Int>>()
        for (entry in map.entries) {
            list.add(entry.toPair())
        }

        list.sortBy { it.second }

        val sb = StringBuilder()
        for (pair in list) {
            sb.append(pair.first)
        }

        return sb.length

    }



    companion object {
        @JvmStatic fun main(args : Array<String>) {
//example for aaabc
            println(Solution6462().minimizedStringLength("aaabc"))
            println(Solution6462().minimizedStringLength("cbbd"))
            println(Solution6462().minimizedStringLength("dddaaa"))
        }
    }
}
