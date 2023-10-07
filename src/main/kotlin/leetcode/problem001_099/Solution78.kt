package before100

class Solution78 {

    fun subsets_v1(nums: IntArray): List<List<Int>> {
        val ans = mutableListOf<List<Int>>()

        dfs_v1(nums, ans, mutableListOf<Int>(), 0)
        return ans//.distinct()
    }

    private fun dfs_v1(nums: IntArray, ans: MutableList<List<Int>>, current: List<Int>, i: Int) {

        if (i >= nums.size) {
            ans.add(current)
            return
        }

        //left decision - include nums[i] current append
        dfs_v1(nums, ans, current.plus(nums[i]), i + 1)
        //right decision - NOT include nums[i]
        //current pop back
        dfs_v1(nums, ans, current, i + 1)

    }

    fun subsets(nums: IntArray): List<List<Int>> {
        val ans = mutableListOf<List<Int>>()

        val current = mutableListOf<Int>()

        fun dsf(i: Int) {
            if (i >= nums.size) {
                ans.add(current.toList())
                return
            }

            current.add(nums[i])
            dsf(i + 1)
            current.remove(nums[i])
            dsf(i + 1)
        }

        dsf(0)
        return ans//.sortedBy { it.size }
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
