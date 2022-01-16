class `Divide Two Integers` {
}

fun divide(dividend: Int, divisor: Int): Int {
    val answer = dividend.toDouble() / divisor
    if (answer < 0) {
        return Math.ceil(answer).toInt()
    }
    return Math.floor(answer).toInt()
}