package s1000

class Solution2101 {

    fun maximumDetonation(bombs: Array<IntArray>): Int {
        // b1 index and b2 index
        val bombsIntersectionMap = mutableMapOf<Pair<Int, Int>, Boolean>()
        val detonatedByThisBomb = Array<MutableList<Int>>(bombs.size) { mutableListOf() }

        bombs.indices.forEach { b1idx ->

            bombs.indices.forEach { b2idx ->
                if (b2idx != b1idx) {
                    val pair = Pair(b1idx, b2idx)
                    val intersection = if (bombsIntersectionMap.containsKey(pair)) {
                        bombsIntersectionMap[pair]!!
                    } else {
                        val isIntersect = isB1SetoffB2(bombs[b1idx], bombs[b2idx])
                        bombsIntersectionMap[pair] = isIntersect
                        isIntersect
                    }
                    if (intersection) {
                        detonatedByThisBomb[b1idx].add(b2idx)
                    }

                }
            }
        }

        val detonated = detonatedByThisBomb.indices.map { idx -> numberOfDetonatedRec(detonatedByThisBomb, idx, mutableSetOf()) }

        return detonated.max() ?: 0
    }


    private fun numberOfDetonatedRec(explosionMap: Array<MutableList<Int>>, bombIndex: Int, exploded: MutableSet<Int>): Int {
        if (bombIndex in exploded) return 0

        exploded.add(bombIndex)
        var detonated = 1 // self
        if (explosionMap[bombIndex].isEmpty()) return detonated

        val boom = explosionMap[bombIndex]
        boom.filter { it !in exploded }.forEach { b2idx ->
//            if (b2idx !in exploded) {
            detonated += numberOfDetonatedRec(explosionMap, b2idx, exploded)
//            }
        }


        return detonated// or just size of exploded
    }

    private fun isB1SetoffB2(b1: IntArray, b2: IntArray): Boolean {
        val x1 = b1[0].toLong()
        val y1 = b1[1].toLong()
        val r1 = b1[2].toLong()

        val x2 = b2[0].toLong()
        val y2 = b2[1].toLong()
        val r2 = b2[2].toLong()

        val dx = x2 - x1
        val dy = y2 - y1
        val dr = r1 //+ r2

        return dx * dx + dy * dy <= dr * dr
    }


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            //add example for [[1,1,100000],[100000,100000,1]]
            val bombs150 = arrayOf(
                    intArrayOf(1, 1, 100000),
                    intArrayOf(100000, 100000, 1),
            )

            println(Solution2101().maximumDetonation(bombs150))

            //add example
//            val bombs = arrayOf(
//                    intArrayOf(2, 1, 3),
//                    intArrayOf(6, 1, 4)
//            )
//            println(Solution2101().maximumDetonation(bombs))

            val bombs2 = arrayOf(
                    intArrayOf(1, 1, 1),
                    intArrayOf(1, 1, 1),
                    intArrayOf(1, 1, 1)
            )
            println(Solution2101().maximumDetonation(bombs2))

            //get examples from [[1,2,3],[2,3,1],[3,4,2],[4,5,3],[5,6,4]]
            val bombs3 = arrayOf(
                    intArrayOf(1, 2, 3),
                    intArrayOf(2, 3, 1),
                    intArrayOf(3, 4, 2),
                    intArrayOf(4, 5, 3),
                    intArrayOf(5, 6, 4)
            )
            println(Solution2101().maximumDetonation(bombs3))

        }
    }
}
