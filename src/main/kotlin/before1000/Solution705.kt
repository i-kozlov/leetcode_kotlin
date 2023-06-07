

class Solution705 {
}
class MyHashSet() {
    private val storage = ByteArray(1000001)

    fun add(key: Int) {
        storage[key] = 1
    }

    fun remove(key: Int) {
        storage[key] = 0
    }

    fun contains(key: Int): Boolean {
        return storage[key] == 1.toByte()
    }

}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */