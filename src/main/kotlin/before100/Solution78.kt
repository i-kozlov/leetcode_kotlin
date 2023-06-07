package before100

class Solution78 {

    fun subsets(nums: IntArray): List<List<Int>> {
        val ans = mutableListOf<List<Int>>()

        dfs(nums, ans, mutableListOf<Int>())
        return ans
    }

    private fun dfs(remainingNums: IntArray, ans: MutableList<List<Int>>, current: List<Int>) {
        ans.add(current.toList())
        if (remainingNums.isEmpty()) {
            return
        }


        val a = remainingNums.drop(1).toIntArray()
        dfs(a, ans, current.plus(remainingNums[0]))
        dfs(a, ans, current)

    }


    companion object {
        @JvmStatic fun main(args : Array<String>) {
            //add test
            //Input: nums = [1,2,3]
            //Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
            println(Solution78().subsets(intArrayOf(1, 2, 3)))

        }
    }
}
