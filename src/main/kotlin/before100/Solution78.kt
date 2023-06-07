package before100

class Solution78 {

    fun subsets(nums: IntArray): List<List<Int>> {
        val ans = mutableListOf<List<Int>>()

        dfs(nums, ans, mutableListOf<Int>(), 0)
        return ans//.distinct()
    }

    private fun dfs(nums: IntArray, ans: MutableList<List<Int>>, current: List<Int>, start: Int) {

        if (start >= nums.size) {
            ans.add(current)
            return
        }


        dfs(nums, ans, current.plus(nums[start]), start + 1)
        dfs(nums, ans, current, start + 1)

    }


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add test
            //Input: nums = [1,2,3]
            //Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
            println(Solution78().subsets(intArrayOf(1, 2, 3)))

        }
    }
}
