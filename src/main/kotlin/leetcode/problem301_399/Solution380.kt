package leetcode.problem301_399

class Solution380 {

    class RandomizedSet() {
        //key - `val`, value - list index
        private val map = mutableMapOf<Int, Int>()
        private val list = mutableListOf<Int>()
        private val rnd = java.util.Random()


        fun insert(`val`: Int): Boolean {
            if (`val` in map) return false
            val listIdx = list.size
            list.add(`val`)
            map[`val`] = listIdx

            return true
        }

        fun remove(`val`: Int): Boolean {
            //remove from map
            val removeItemListIdx = map.remove(`val`)
            if (removeItemListIdx == null) return false

            //remove from list by O(1) -> from end
            if (removeItemListIdx == list.size - 1) {
                list.removeAt(removeItemListIdx)
                return true
            }

            //swap list items to get current to the end
            val lastElement = list[list.size - 1]
            list.set(removeItemListIdx, lastElement)
            //actually no need to swap - just drop last one
            list.removeAt(list.size - 1)

            //update map idx
            map[lastElement] = removeItemListIdx
            return true
        }

        fun getRandom(): Int {
            val idx = rnd.nextInt(list.size)
            return list[idx]
        }

    }
}
