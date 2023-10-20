package leetcode.problem701_799

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Solution735Test {

    @Test
    fun asteroidCollision() {
        val solution735 = Solution735()

        assertArrayEquals(intArrayOf(-2, -2, -2), solution735.asteroidCollision(intArrayOf(1, -2, -2, -2)))
        assertArrayEquals(intArrayOf(-2, -2, -2), solution735.asteroidCollision(intArrayOf(-2, -2, 1, -2)))
        assertArrayEquals(intArrayOf(5, 10), solution735.asteroidCollision(intArrayOf(5, 10)))
        assertArrayEquals(intArrayOf(), solution735.asteroidCollision(intArrayOf(10, -10)))
        assertArrayEquals(intArrayOf(10), solution735.asteroidCollision(intArrayOf(10, 2, -5)))
        assertArrayEquals(intArrayOf(-2, -1, 1, 2), solution735.asteroidCollision(intArrayOf(-2, -1, 1, 2)))

    }
}