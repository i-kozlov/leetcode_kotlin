package over1000

import java.util.*

class Solution1921 {
    class Monster(start: Int, val speed: Int) {
        var dist = start

        fun move() {
            dist -= speed
        }

        fun predict(): Int = dist - speed
        override fun toString(): String {
            return "Monster(speed=$speed, dist=$dist)"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            return false
        }

        override fun hashCode(): Int {
            var result = speed
            result = 31 * result + dist
            return result
        }

    }

    fun eliminateMaximum(dist: IntArray, speed: IntArray): Int {
        var killed = 0
        val n = dist.size

        val comparator = Comparator<Monster> { m1, m2 -> m1.predict() compareTo m2.predict() }
        val heap = PriorityQueue<Monster>(comparator)
        val treeSet = TreeSet<Monster>(comparator)
        for (i in dist.indices) {
//            heap.add(Monster(dist[i], speed[i]))
            treeSet.add(Monster(dist[i], speed[i]))
        }

        while (killed < n) {

            treeSet.first().let {
                val didNotReach = it.dist > 0
                if (didNotReach) {
                    killed++
                    treeSet.remove(it)
                } else {
                    return killed
                }
            }

            treeSet.forEach(Monster::move)

//            val head = heap.poll()
//            killed++
//
//            val moved = mutableListOf<Monster>()
//            while (heap.isNotEmpty()) {
//                val m = heap.poll()
//                m.move()
//                if (m.dist <= 0) return killed
//                moved.add(m)
//            }
//            heap.addAll(moved)

        }

        return killed
    }
}
