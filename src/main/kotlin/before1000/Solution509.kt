class Solution509 {
    fun fib1(n: Int): Int {
        if (n <= 1) return n
        return fib(n - 1) + fib(n - 2)
    }

    fun fib(n: Int): Int {
        fun fibInt(n: Int, map: MutableMap<Int, Int>): Int {
            if (!map.contains(n)) {
                val value = fibInt(n - 1, map) + fibInt(n - 2, map)
                map[n] = value
            }
            return map[n]!!
        }

        return fibInt(n, mutableMapOf(0 to 0, 1 to 1))
    }

}
