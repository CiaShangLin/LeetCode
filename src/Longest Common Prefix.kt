class `Longest Common Prefix` {
}

fun longestCommonPrefix(strs: Array<String>): String {

    var min = Int.MAX_VALUE
    val length = strs.size
    strs.forEach {
        min = Math.min(min, it.length)
    }

    if (min == 0) {
        return ""
    }

    var index = 0
    var char: Char

    for (i in 0 until min) {
        char = strs[0][i]
        var count = 0
        strs.forEach {
            if (char == it[i]) {
                count++
            }
        }

        if (count != length) {
            break
        } else {
            index++
        }

    }

    return strs[0].substring(0, index)
}