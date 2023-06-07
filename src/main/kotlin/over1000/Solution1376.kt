package s1000

class Solution1376 {

    fun numOfMinutes(n: Int, headID: Int, manager: IntArray, informTime: IntArray): Int {
        val map = LinkedHashMap<Int, MutableList<Int>>()
        map[headID] = mutableListOf()
        manager.indices.forEach { idx ->
            val managerID = manager[idx]
            if (managerID > -1) {
                val list = map.getOrDefault(managerID, mutableListOf())
                list.add(idx)
                map[managerID] = list
            }
        }

        return calcLength(map, headID, informTime, 0)
    }

    private fun calcLength(map: Map<Int, MutableList<Int>>, currentManager: Int, informTime: IntArray, totalTime: Int): Int {
        if (map[currentManager] == null) {
            return totalTime
        }

        val times = map[currentManager]!!.map { calcLength(map, it, informTime, totalTime + informTime[currentManager]) }
        return times.maxOrNull() ?: totalTime
    }


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            //add example for Input: n = 7, headID = 6, manager = [1,2,3,4,5,6,-1], informTime = [0,6,5,4,3,2,1]
            println(Solution1376().numOfMinutes(7, 6, intArrayOf(1, 2, 3, 4, 5, 6, -1), intArrayOf(0, 6, 5, 4, 3, 2, 1)))
            //add example for n = 6, headID = 2, manager = [2,2,-1,2,2,2], informTime = [0,0,1,0,0,0]
            println(Solution1376().numOfMinutes(6, 2, intArrayOf(2, 2, -1, 2, 2, 2), intArrayOf(0, 0, 1, 0, 0, 0)))

            //add example for Input: n = 1, headID = 0, manager = [-1], informTime = [0]
            println(Solution1376().numOfMinutes(1, 0, intArrayOf(-1), intArrayOf(0)))

        }
    }
}
