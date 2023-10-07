package before100

class Solution39 {

    fun combinationSum_v1(candidates: IntArray, target: Int): List<List<Int>> {
        val ans = mutableListOf<List<Int>>()

        find_v1(candidates, target, emptyList(), ans)
        return ans.distinct()
    }

    fun find_v1(candidates: IntArray, target: Int, current: List<Int>, ans: MutableList<List<Int>>) {
        if (target < 0) return
        if (target == 0) {
            ans.add(current.sorted())
            return
        }

        candidates.indices.forEach { idx ->
            val candidate = candidates[idx]
            val newTarget = target - candidate
            val newCurrent = current + candidate
            find_v1(candidates, newTarget, newCurrent, ans)
            find_v1(candidates.drop(idx + 1).toIntArray(), newTarget, newCurrent, ans)
        }
    }

    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val ans = mutableListOf<List<Int>>()

        dfs(candidates, target, emptyList(), ans, 0)
        return ans
    }

    fun dfs(candidates: IntArray, target: Int, current: List<Int>, ans: MutableList<List<Int>>, start: Int) {
        if (target < 0 || start >= candidates.size) return
        if (target == 0) {
            ans.add(current)
            return
        }


        val candidate = candidates[start]
        val newTarget = target - candidate
        //if current is mutable we can use current.add(candidate)
        dfs(candidates, newTarget, current.plus(candidate), ans, start)
        //add pop back here


        dfs(candidates, target, current, ans, start + 1)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add example and check result
            val ans = Solution39().combinationSum(intArrayOf(2, 3, 6, 7), 7)
            println(ans)


        }
    }
}
