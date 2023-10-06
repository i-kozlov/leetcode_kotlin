package leetcode.problem301_399

class Solution343 {

    fun integerBreak(n: Int): Int {
        var k = 2;
        var max = 0;
        for (i in k..n ) {
            val l = product(n, k)
            val p = l.reduce { acc, el -> acc * el }
            if (p < max) {
                break;
            } else {
                max = p
            }
            k++
        }

        return max
    }

    private fun product(n: Int, k: Int): List<Int> {
        if (k == 1) return listOf(n);

        val first = n / k
        return listOf(first) + (product(n - first, k - 1))
    }

}
