package before1000

class Solution208 {


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add example
        }
    }
}

class TrieNode() {
    val children = mutableMapOf<Char, TrieNode>()
    var isWord = false
}

class Trie() {

    private val root = TrieNode()

    fun insert(word: String) {
        var current = root
        for (c in word) {

            if (current.children[c] == null) {
                current.children[c] = TrieNode()
            }
            current = current.children[c]!!
        }

        current.isWord = true
    }

    fun search(word: String): Boolean {
        var current = root
        for (c in word) {
            if (current.children[c] == null) {
                return false
            }
            current = current.children[c]!!
        }

        return current.isWord
    }

    fun startsWith(prefix: String): Boolean {
        var current = root
        for (c in prefix) {
            if (current.children[c] == null) {
                return false
            }
            current = current.children[c]!!
        }
        return true
    }

}