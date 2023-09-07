class `Rotate Image` {
    fun rotate(matrix: Array<IntArray>): Unit {
        //行轉列
        for (i in 0 until matrix.size) {
            for (j in i until matrix.size) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp
            }
        }
        //左右互換
        for (i in 0 until matrix.size / 2) {
            for (j in 0 until matrix.size) {
                val temp = matrix[j][i]
                matrix[j][i] = matrix[j][matrix.size - i - 1]
                matrix[j][matrix.size - i - 1] = temp
            }
        }
    }
}