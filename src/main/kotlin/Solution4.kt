class Solution4 {

    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val totalSize = nums1.size + nums2.size
        val medianSize = if (totalSize % 2 == 0) {
            totalSize / 2 + 1
        } else {
            totalSize / 2 + 1
        }
        val sorted = IntArray(medianSize)
        var i = 0
        var j = 0
        var k = 0

        while (k < medianSize) {
            when {
                i == nums1.size -> {
                    sorted[k] = nums2[j]
                    j++
                }

                j == nums2.size -> {
                    sorted[k] = nums1[i]
                    i++
                }
                nums1[i] < nums2[j] -> {
                    sorted[k] = nums1[i]
                    i++
                }
                else -> {
                    sorted[k] = nums2[j]
                    j++
                }
            }

            k++
        }


        return if (totalSize % 2 == 0) {
            (sorted[sorted.size - 1] + sorted[sorted.size - 2]) / 2.0
        } else {
            sorted[sorted.size - 1].toDouble()
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add example
            val s = Solution4()
            println(s.findMedianSortedArrays(intArrayOf(1, 2), intArrayOf(3, 4)))
            println(s.findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2)))
        }
    }
}
