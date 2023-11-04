package over1000

class Solution2017 {

    fun gridGame(grid: Array<IntArray>): Long {


        val row1 = calcPostfix(grid[0])
        val row2 = calcPrefix(grid[1])

        //first robot path
        pathWithRemoving(arrayOf(row1, row2))

        val rightMax = row1.max()
        val bottomMax = row2.max()
        return Math.max(rightMax, bottomMax)
    }

    private fun pathWithRemoving(grid: Array<LongArray>) {

        var rowNum = 0
        var i = 0
        val size = grid[0].size
        while (i < size) {
            grid[rowNum][i] = 0

            //if on the top row - chooce next row
            //else just keep moving
            if (i + 1 == size) {
                grid[1][i] = 0
                rowNum++
                i++ //to stop
            } else if (rowNum == 0) {

                val caseGoBottom = grid[0][i + 1] //max sum in row 0 from i + 1 till end
                val caseGoLeft = grid[1][i] // max sum from left to right in row 1
                if (caseGoBottom > caseGoLeft) {
                    i++
                } else {
                    rowNum++
                }
            } else {
                i++ //keep moving right
            }

        }
    }

    private fun calcPostfix(row: IntArray): LongArray {
        val arr = LongArray(row.size)
        arr[row.size - 1] = row[row.size - 1].toLong()
        for (i in row.size - 2 downTo 0) {
            arr[i] = row[i] + arr[i + 1]
        }
        return arr
    }

    private fun calcPrefix(row: IntArray): LongArray {
        val arr = LongArray(row.size)
        arr[0] = row[0].toLong()
        for (i in 1 until row.size) {
            arr[i] = arr[i - 1] + row[i]
        }
        return arr
    }
}
