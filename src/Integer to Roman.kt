class `Integer to Roman` {
}

fun intToRoman(num: Int): String {
    var num = num
    val str = StringBuffer("")
    val list = mutableListOf<Pair<Int, String>>().apply {
        add(Pair(1000, "M"))
        add(Pair(900, "CM"))
        add(Pair(500, "D"))
        add(Pair(400, "CD"))
        add(Pair(100, "C"))
        add(Pair(90, "XC"))
        add(Pair(50, "L"))
        add(Pair(40, "XL"))
        add(Pair(10, "X"))
        add(Pair(9, "IX"))
        add(Pair(5, "V"))
        add(Pair(4, "IV"))
        add(Pair(1, "I"))
    }
    list.forEach {
        addStr(num / it.first, it.second, str)
        num %= it.first
        if (num <= 0) {
            return@forEach
        }
    }
    return str.toString()
}

fun addStr(n: Int, roman: String, str: StringBuffer) {
    for (i in 0 until n) {
        str.append(roman)
    }
}