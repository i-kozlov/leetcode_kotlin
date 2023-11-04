package over1000

class Solution2017 {

    fun gridGame(grid: Array<IntArray>): Long {

        val row1 = grid[0].clone()
        val row2 = grid[1].clone()

        calcPrefixs(row1)
        calcPrefixs(row2)

        //first robot path
        val robot1 = pathWithRemoving(arrayOf(row1, row2))
        //copy zeros
        for (i in 0..row1.size - 1) {
            if (row1[i] == 0) {
                grid[0][i] = 0
            }
            if (row2[i] == 0) {
                grid[1][i] = 0
            }
        }
        calcPrefixs(grid[0])
        calcPrefixs(grid[1])

        val rightSum = grid[0][1].toLong()
        val bottomSum = grid[1][0].toLong()
        return if(rightSum > bottomSum) rightSum else bottomSum
    }

    private fun pathWithRemoving(grid: Array<IntArray>) {

        var rowNum = 0
        var i = 0
        val size = grid[0].size
        while (i < size) {

            //if on the top row - chooce next row
            //else just keep moving
            if (i + 1 == size) {
                grid[1][i] = 0
                rowNum++
                i++ //to stop
            } else if (rowNum == 0) {
                val rightSum = grid[rowNum][i + 1]
                val bottomSum = grid[rowNum + 1][i]
                if (rightSum > bottomSum) {
                    i++
                } else {
                    rowNum++
                }
            } else {
                i++ //keep moving right
            }
            grid[rowNum][i] = 0
        }
    }

    private fun calcPrefixs(row: IntArray) {
        for (i in row.size - 2 downTo 0) {
            row[i] = row[i] + row[i + 1]
        }
    }
}
