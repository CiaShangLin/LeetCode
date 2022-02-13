class `Valid Sudoku` {
}

fun isValidSudoku(board: Array<CharArray>): Boolean {

    // 橫向檢查
    for (i in 0 until 9) {
        val set = mutableSetOf<Char>()
        for (j in 0 until 9) {
            val char = board[i][j]
            if (char == '.') {
                continue
            }
            if (set.contains(char)) {
                return false
            }
            set.add(char)
        }
    }

    // 直向檢查
    for (i in 0 until 9) {
        val set = mutableSetOf<Char>()
        for (j in 0 until 9) {
            val char = board[j][i]
            if (char == '.') {
                continue
            }
            if (set.contains(char)) {
                return false
            }
            set.add(char)
        }
    }

    // 九宮格檢查
    for (i in 0 until 9 step 3) {
        for (j in 0 until 9 step 3) {
            if (!checkNine(board, i, j)) {
                return false
            }
        }
    }

    return true
}

fun checkNine(board: Array<CharArray>, start: Int, end: Int): Boolean {
    val set = mutableSetOf<Char>()
    for (i in start until start + 3) {
        for (j in end until end + 3) {
            val char = board[i][j]
            if (char == '.') {
                continue
            }
            if (set.contains(char)) {
                return false
            }
            set.add(char)
        }
    }
    return true
}