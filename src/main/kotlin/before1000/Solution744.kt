package before1000

import other.TreeNode

class Solution744 {

    fun nextGreatestLetter(letters: CharArray, target: Char): Char {
        if (letters.last() <= target || letters.first() > target) return letters[0]

        var (left, right) = (0 to letters.size - 1)


        while (left < right) {
            val mid = (left + right) / 2
            if (letters[mid] == target) {
                left = mid
                break
            } else if (letters[mid] > target) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }

        while(letters[left] <= target && left < letters.size) left++

        return if(left < letters.size) letters[left] else letters[0]

    }


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            //add example
            //Input: letters = ["c","f","j"], target = "a"
            //Output: "c"

            val s = Solution744()
            println(s.nextGreatestLetter(charArrayOf('c', 'f', 'j'), 'a'))
            println(s.nextGreatestLetter(charArrayOf('c', 'f', 'j'), 'c'))
            println(s.nextGreatestLetter(charArrayOf('c', 'f', 'j'), 'd'))

            //Input: letters = ["x","x","y","y"], target = "z"
            //Output: "x"
            println(s.nextGreatestLetter(charArrayOf('x', 'x', 'y', 'y'), 'z'))

            //["c","f","j"]

            println(s.nextGreatestLetter(charArrayOf('c', 'f', 'j'), 'j'))
            println(s.nextGreatestLetter(charArrayOf('c', 'f', 'j'), 'k'))


        }
    }
}
