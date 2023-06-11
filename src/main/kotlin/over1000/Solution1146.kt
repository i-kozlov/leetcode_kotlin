package over1000

import other.TreeNode

class Solution1146 {


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add example
        }
    }
}

class SnapshotArray(length: Int) {
    private val snapshots = mutableMapOf<Int, HashMap<Int, Int>>()
    private val array = object : HashMap<Int, Int>() {
        override fun get(key: Int): Int {
            return super.get(key) ?: 0
        }
    }
    private var snap_id = 0

    fun set(index: Int, `val`: Int) {
        array[index] = `val`
    }

    fun snap(): Int {
        snapshots[snap_id] = array.clone() as HashMap<Int, Int>
        snap_id++
        return snap_id - 1
    }

    fun get(index: Int, snap_id: Int): Int {
        return snapshots[snap_id]!![index]!!
    }

}