package s1000

import other.TreeNode

class Solution1502 {

    // O (N logN)
    fun canMakeArithmeticProgression1(arr: IntArray): Boolean {
        arr.sort()
        val diff = arr[1] - arr[0]
        for (i in 2 until arr.size) {
            if (arr[i] - arr[i - 1] != diff) {
                return false
            }
        }

        return true
    }
    //O(N)
    fun canMakeArithmeticProgression(arr: IntArray): Boolean {
        val (min, max) = (arr.min()!! to arr.max()!!)
        val n = arr.size

        if (min - max == 0) return true
        //при разнице на одно число, (max - min) на количество должны дать это число
        if ((max - min) % (n - 1) != 0) return false

        val diff = (max - min) / (n - 1)

        val set = HashSet<Int>()
        arr.forEach {
            if ((it - min) % diff != 0) return false
            set.add((it - min) / diff)
        }
        //на случай дубликатов или если все числа одинаковые
        return set.size == n
    }

    companion object {
        @JvmStatic fun main(args : Array<String>) {

        }
    }
}
