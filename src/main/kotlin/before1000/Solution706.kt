class Solution706 {
//\todo решение через arrayOfNulls<LinkedList<Entry>>(2000)
    class MyHashMap() {

        private val map = IntArray(1000001) { -1 }
        fun put(key: Int, value: Int) {
            map[key] = value
        }

        fun get(key: Int): Int {
            return map[key]
        }

        fun remove(key: Int) {
            map[key] = -1
        }

    }
    companion object {
        @JvmStatic fun main(args : Array<String>) {

        }
    }
}
