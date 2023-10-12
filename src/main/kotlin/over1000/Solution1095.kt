package over1000


class Solution1095 {
    class MountainArray(val arr: IntArray) {
        fun get(index: Int): Int = arr[index]
        fun length(): Int = arr.size
        override fun toString(): String {
            return "MountainArray(arr=${arr.contentToString()})"
        }

    }

    fun findInMountainArray(target: Int, mountainArr: MountainArray): Int {
        //top
        val top = findTop(mountainArr)
        println("top " + top)
        if (target == mountainArr.get(top)) return top
        //top -> left
        val indexL = findLeft(target, mountainArr, 0, top)
        println("indexL " + indexL)

        if (indexL > -1) return indexL

        //top-> right
        return findRight(target, mountainArr, top, mountainArr.length() - 1)
    }

    private fun findLeft(target: Int, mountainArr: MountainArray, L: Int, R: Int): Int {
        if (L > R) return -1;
        val mid = (L + R) / 2
        return when {
            mountainArr.get(mid) == target -> mid
            mountainArr.get(mid) > target -> findLeft(target, mountainArr, L, mid - 1)
            else -> findLeft(target, mountainArr, mid + 1, R)
        }
    }

    private fun findRight(target: Int, mountainArr: MountainArray, L: Int, R: Int): Int {
        if (L > R) return -1;
        val mid = (L + R) / 2
        return when {
            mountainArr.get(mid) == target -> mid
            mountainArr.get(mid) < target -> findRight(target, mountainArr, L, mid - 1)
            else -> findRight(target, mountainArr, mid + 1, R)
        }
    }

    private fun isLeftSmaller(mountainArr: MountainArray, index: Int): Boolean {
        return index == 0 || mountainArr.get(index - 1) < mountainArr.get(index)
    }

    private fun isRightSmaller(mountainArr: MountainArray, index: Int): Boolean {
        return index == mountainArr.length() - 1 || mountainArr.get(index) > mountainArr.get(index + 1)
    }

    private fun findTop(mountainArr: MountainArray): Int {
        var (L, R) = 0 to mountainArr.length()
        var current = (L + R) / 2
        while (L < R) {
            //  current - 1 <  current(realTop)  > current + 1
            val realTop = isLeftSmaller(mountainArr, current) && isRightSmaller(mountainArr, current)

            if (realTop) {
                return current
            }

            // TOP ...  > current - 1 >  current > current + 1 - DEC
            // current - 1 <  current < current + 1 < ... TOP - INC
            if (isRightSmaller(mountainArr, current)) {
                R = current - 1
            } else {
                L = current + 1
            }
            current = (L + R) / 2
        }

        return current
    }
}
