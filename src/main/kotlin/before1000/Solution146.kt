import java.util.*


class Solution146 {

    class LRUCache(capacity: Int) {
        private val map = HashMap<Int, Int>(capacity)
        private val ca = capacity
//        private var operationsCounter = 0

        private val queue = LinkedList<Int>()

        fun get(key: Int): Int {

            val value = map[key]
            if (value != null) {
                touchKey(key)
            }
            return value ?: -1
        }

        fun put(key: Int, value: Int) {
            val value1 = map[key]
            if (value1 != null) {
                touchKey(key)

                map[key] = value
                return
            }

            if (map.size == ca) {
                evict()
            }

            map[key] = value
            queue.offer(key)
        }

        private fun touchKey(key: Int) {
            queue.indexOf(key).let {
                if (it != -1) {
                    queue.removeAt(it)
                    queue.offer(key)
                }
            }
        }

        private fun evict() {
            val el = queue.removeFirst()
            map.remove(el)
        }

    }


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add examples
            //Input
            //["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
            //[[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
            //Output
            //[null, null, null, 1, null, -1, null, -1, 3, 4]

            val lRUCache = LRUCache(2)
            lRUCache.put(1, 1) // cache is {1=1}
            lRUCache.put(2, 2) // cache is {1=1, 2=2}
            lRUCache.get(1) // return 1
            lRUCache.put(3, 3) // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
            lRUCache.get(2) // returns -1 (not found)
            lRUCache.put(4, 4) // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
            lRUCache.get(1) // return -1 (not found)
            lRUCache.get(3) // return 3
            lRUCache.get(4) // return 4

            //["LRUCache","get","put","get","put","put","get","get"]
            //[[2],[2],[2,6],[1],[1,5],[1,2],[1],[2]]
            val lRUCache2 = LRUCache(2)
            lRUCache2.get(2)
            lRUCache2.put(2, 6)
            lRUCache2.get(1)
            lRUCache2.put(1, 5)
            lRUCache2.put(1, 2)
            lRUCache2.get(1)
            lRUCache2.get(2)


        }
    }
}
