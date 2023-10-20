package leetcode.problem901_999

import org.junit.jupiter.api.Assertions.*

class Solution933Test {

        @org.junit.jupiter.api.Test
        fun ping() {
            val counter = Solution933().RecentCounter()

            assertEquals(1, counter.ping(1))
            assertEquals(2, counter.ping(100))
            assertEquals(3, counter.ping(3001))
            assertEquals(3, counter.ping(3002))

            val counter2 = Solution933().RecentCounter()

            assertEquals(1, counter2.ping(642))
            assertEquals(2, counter2.ping(1849))
            assertEquals(1, counter2.ping(4921))
            assertEquals(2, counter2.ping(5936))
            assertEquals(3, counter2.ping(5957))
        }
}