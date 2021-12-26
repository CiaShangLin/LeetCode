class `Roman to Integer` {
}

fun romanToInt(s: String): Int {
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

    var roman = 0
    val str = StringBuilder(s)

    list.forEach {
        while (str.startsWith(it.second)) {
            roman += it.first
            str.delete(0, it.second.length)
        }
    }
    return roman
}