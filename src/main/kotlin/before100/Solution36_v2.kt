package before100

class Solution36_v2 {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        for (i in 0..8) {
            if (!checkRow(board, i)) return false
            if (!checkColumn(board, i)) return false
        }
        for (i in 0..2) {
            for (j in 0..2) {
                if (!checkSquare(board, i*3, j*3)) return false
            }
        }

        return true
    }

    fun checkNine(list: List<Char>): Boolean{
        val set = mutableSetOf<Char>()
        for (i in list) {
            if (i == '.') continue

            if (!set.add(i)) return false
        }
        return true
    }

    fun checkSquare(board: Array<CharArray>, x: Int, y: Int): Boolean {
        val set = mutableSetOf<Char>()
        for (i in x..x+2) {
            for (j in y..y+2) {
                val cell = board[i][j]
                if (cell == '.') continue

                if (!set.add(cell)) return false
            }
        }
        return true
    }

    private fun checkRow(board: Array<CharArray>, row: Int): Boolean {
        val list = mutableListOf<Char>()
        for (i in 0..8) {
            list.add(board[row][i])
        }
        return checkNine(list)
    }
    private fun checkColumn(board: Array<CharArray>, row: Int): Boolean {
        val list = mutableListOf<Char>()
        for (i in 0..8) {
            val cell = board[i][row]
            list.add(cell)
        }
        return checkNine(list)
    }
}

fun main() {
    println(Solution36().isValidSudoku(arrayOf(
        charArrayOf('5','3','.','.','7','.','.','.','.'),
        charArrayOf('6','.','.','1','9','5','.','.','.'),
        charArrayOf('.','9','8','.','.','.','.','6','.'),
        charArrayOf('8','.','.','.','6','.','.','.','3'),
        charArrayOf('4','.','.','8','.','3','.','.','1'),
        charArrayOf('7','.','.','.','2','.','.','.','6'),
        charArrayOf('.','6','.','.','.','.','2','8','.'),
        charArrayOf('.','.','.','4','1','9','.','.','5'),
        charArrayOf('.','.','.','.','8','.','.','7','9')
    )))
}
