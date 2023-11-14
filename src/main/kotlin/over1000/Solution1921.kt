package over1000

import java.util.*

class Solution1921 {
    fun eliminateMaximum(dist: IntArray, speed: IntArray): Int {

        var killed = 0
        var shotCharged = 1
        val n = dist.size

        val arrival = IntArray(n + 1)
        for (i in dist.indices) {
            val minutesToCity = dist[i] * 1.0 / speed[i]
            //if it takes more than n minutes to get to city - can reduce time to n
            //we can round time up as "if a monster reaches the city at the exact moment the weapon is fully charged, it counts as a loss"
            val arrivalMinute = if (minutesToCity > n) n else Math.ceil(minutesToCity).toInt()
            arrival[arrivalMinute] += 1
        }

        for (minutesPassed in 1..n) {

            while (arrival[minutesPassed] > 0 && shotCharged> 0) {
                arrival[minutesPassed]--
                shotCharged--
                killed++
            }

            val lose = arrival[minutesPassed] > 0
            if (lose) break;
            //"if a monster reaches the city at the exact moment the weapon is fully charged, it counts as a loss"
            //so we count as charged only if monster is killed
            shotCharged++
        }


        return killed
    }
}
