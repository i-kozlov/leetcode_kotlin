class Solution978 {

    fun maxTurbulenceSize(arr: IntArray): Int {
        if (arr.isEmpty()) return 0;

        var maxSize = 1

        var currentCount = 1
        var expectedCompare = 0

        var i = 1
        while (i <= arr.size - 1) {
            val prev = arr[i - 1]
            val next = arr[i]

            val compare = next.compareTo(prev)

            if (currentCount == 1 && compare != 0) {
                //set next expected - inc or dec
                expectedCompare = -1 * compare
                i++
//                prev = next
            } else if (currentCount > 1 && compare == expectedCompare) {
                expectedCompare = -1 * compare
                i++
//                prev = next
            } else {
                //not turbulent - reset
                maxSize = maxOf(maxSize, currentCount)
                currentCount = 0
                //do not set prev = next as we need to try going from CURRENT item
                //unless the numbers are same
                if (compare == 0) i++
            }


            currentCount++

        }

        return maxOf(maxSize, currentCount)
    }
}

fun main() {
    //add examples
    val s = Solution978()
//    println(s.maxTurbulenceSize(intArrayOf(9, 4, 2, 10, 7, 8, 8, 1, 9)))

//    println(s.maxTurbulenceSize(intArrayOf(0, 1, 1, 0, 1, 0, 1, 1, 0, 0)))

    println(s.maxTurbulenceSize(intArrayOf(0,8,45,88,48,68,28,55,17,24)) == 8)

}
