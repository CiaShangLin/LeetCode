import java.math.BigInteger

class `String to Integer (atoi)` {

    fun myAtoi(str: String): Int {
        //這題難在例外上的處理
        //所以對於篩選字串上要經過特別處理 這樣在例外上處理才會比較輕鬆
        val start = str.subSequence(findStart(str), str.length).toString()
        val substr = start.subSequence(0, findEnd(start)).toString()

        val bigVal = if (substr.isNotEmpty() && substr != "-" && substr != "+") BigInteger(substr) else BigInteger("0")

        if (bigVal > BigInteger(Integer.MAX_VALUE.toString())) return Integer.MAX_VALUE
        if (bigVal < BigInteger(Integer.MIN_VALUE.toString())) return Integer.MIN_VALUE
        return bigVal.toInt()
    }

    fun findStart(str: String): Int {
        var i = 0
        while (i < str.length) {
            if (!str[i].isWhitespace() || str[i] == '-' || str[i] == '+')
                return i
            i++
        }
        return str.length
    }

    fun findEnd(str: String): Int {
        str.forEachIndexed { index, c ->
            if (!c.isDigit() && !((c == '-' || c == '+') && index == 0)) {
                return index
            }
        }
        return str.length
    }

}