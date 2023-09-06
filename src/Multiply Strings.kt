/**
 * 大數乘法
 * 用暴力解基本上也能過
 * 這個主要是透過位移的方法讓他相乘相加
 */
class `Multiply Strings` {
    fun multiply(num1: String, num2: String): String {
        val m = num1.length
        val n = num2.length
        val resultArray = IntArray(m + n)

        for (i in m - 1 downTo 0) {
            for (j in n - 1 downTo 0) {
                val mul = (num1[i] - '0') * (num2[j] - '0')
                val sum = mul + resultArray[i + j + 1]
                resultArray[i + j + 1] = sum % 10
                resultArray[i + j] += sum / 10
            }
        }

        val result = StringBuilder()
        for (num in resultArray) {
            if (!(result.isEmpty() && num == 0)) {
                result.append(num)
            }
        }

        return if (result.isEmpty()) "0" else result.toString()
    }
}