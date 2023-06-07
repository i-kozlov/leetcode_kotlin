package s1000

class Solution1396 {

    class UndergroundSystem() {

        private val checkInMap = mutableMapOf<Int, Pair<String, Int>>()
        private val averageTime = mutableMapOf<Pair<String, String>, Pair<Int, Int>>()

        fun checkIn(id: Int, stationName: String, t: Int) {
            checkInMap[id] = Pair(stationName, t)
        }

        fun checkOut(id: Int, stationName: String, t: Int) {
            val (startStation, startTime) = checkInMap[id]!!
            val key = Pair(startStation, stationName)
            val (totalTime, count) = averageTime.getOrDefault(key, Pair(0, 0))
            averageTime[key] = Pair(totalTime + t - startTime, count + 1)

        }

        fun getAverageTime(startStation: String, endStation: String): Double {
            val (totalTime, count) = averageTime[Pair(startStation, endStation)]!!
            return totalTime.toDouble() / count
        }

    }

    companion object {
        @JvmStatic fun main(args : Array<String>) {

        }
    }
}
