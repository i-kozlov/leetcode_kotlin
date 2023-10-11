package leetcode.problem400_499

class Solution459 {

    fun repeatedSubstringPattern(s: String): Boolean {

        var size = s.length / 2
        while (size > 0) {
            if(s.length % size != 0) {
                size--
                continue
            }
            var prev = s.substring(0, size)
            var checkedAll = true
            for (i in size..s.length - 1 step size) {
                val cur = s.substring(i, i + size)
                if (cur != prev) {
                    checkedAll = false
                    break;
                }
                prev = cur
            }
            //got throw all and they are equals
            if (checkedAll) {
                return true;
            }
            size--
        }

        return false
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add example
        }
    }
}
