package over1000

import java.util.LinkedList

class Solution2390 {
    fun removeStars(s: String): String {
        val list = LinkedList<Char>()
        for (c in s) {
            if (c == '*') {
                if (list.isNotEmpty()) {
                    list.removeLast()
                }
            } else {
                list.add(c)
            }
        }
        return list.joinToString("")
    }

}
