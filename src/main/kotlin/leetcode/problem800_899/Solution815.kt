package leetcode.problem800_899

class Solution815 {
    //stop to routes

    val adjList = HashMap<Int, MutableList<Int>>()
    val visited = HashSet<Int>()
    fun numBusesToDestination(routes: Array<IntArray>, source: Int, target: Int): Int {


        for (i in 0 until routes.size) {
            for (stop in routes[i]) {
                if (stop !in adjList) {
                    adjList[stop] = mutableListOf<Int>()
                }
                adjList[stop]?.add(i)
            }

        }


        var minBusNumber = bfs(source, 0, target, routes)

        return if (minBusNumber == Int.MAX_VALUE) -1 else minBusNumber

    }
    fun bfs(source: Int, level: Int, target: Int, routes: Array<IntArray>): Int {
        if (source == target) return level
        if (source in visited) return Int.MAX_VALUE

        var found = Int.MAX_VALUE
        if(adjList[source] == null) return found
        for (routeIndex in adjList[source]!!) {
            for (stop in routes[routeIndex]) {
                visited.add(stop)
                found = minOf(found, bfs(stop, level + 1, target, routes))
            }
        }
        return found
    }

}
