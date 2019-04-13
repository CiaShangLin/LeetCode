class `ZigZag Conversion` {

    fun convert(s: String, numRows: Int): String {
        if(numRows==1)
            return s
        var list = mutableListOf<MutableList<Char>>()
        for (i in 0..Math.min(numRows, s.length) - 1) {
            list.add(mutableListOf())
        }
        var i = 0
        var flag = false
        s.forEach {
            list.get(i).add(it)
            if (i == 0 || i == numRows - 1)
                flag = !flag
            i += if (flag) 1 else -1
        }

        var str: StringBuffer = StringBuffer("")
        list.forEach {
            it.forEach {
                str.append(it)
            }
        }

        return str.toString()
    }

}