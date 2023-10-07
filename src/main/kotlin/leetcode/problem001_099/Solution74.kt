package before100

class Solution74 {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        if(matrix.isEmpty()) return false
        if(matrix[0].isEmpty()) return false
        if (target < matrix[0].first()) return false
        if (target > matrix.last().last()) return false
        if(matrix.size == 1) return search(matrix[0], target) > -1

        val firstColumn = IntArray(matrix.size) { matrix[it].first() }
        val pair = findRow(firstColumn, target)

        return search(matrix[minOf(pair.first, pair.second)], target) > -1
    }

    fun findRow(column: IntArray, target: Int): Pair<Int, Int> {
        if(column.size == 1) return 0 to 0

        var (left, right) = 0 to column.lastIndex
        while (left <= right){
            val middle = (left + right) / 2
            if(column[middle] == target) return middle to middle
            else if(column[middle] < target) left = middle + 1
            else right = middle - 1
        }
        return right to left
    }

    fun search(nums: IntArray, target: Int): Int {
        var (left, right) = 0 to nums.lastIndex
        while (left <= right){
            val middle = (left + right) / 2
            if(nums[middle] == target) return middle
            else if(nums[middle] < target) left = middle + 1
            else right = middle - 1
        }

        return -1
    }

    companion object {
        @JvmStatic fun main(args : Array<String>) {

            //add example
            var matrix = arrayOf(
                    intArrayOf(1,3,5,7),
                    intArrayOf(10,11,16,20),
                    intArrayOf(23,30,34,60)
            )

            var ans = Solution74().searchMatrix(matrix, 3)
            println(ans)

            ans = Solution74().searchMatrix(matrix, 21)
            println(ans)

            ans = Solution74().searchMatrix(arrayOf(intArrayOf(1)), 0)
            println(ans)

            ans = Solution74().searchMatrix(arrayOf(intArrayOf(1), intArrayOf(3)), 0)
            println(ans)
            //add more examples
        }
    }


}
