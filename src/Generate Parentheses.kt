class `Generate Parentheses` {
}

//基本上就是二元樹,把樹畫出來就很好懂了,左節點一定是左括弧,右節點一定是右括弧
fun generateParenthesis(n: Int): List<String> {
    val answer = mutableListOf<String>()
    backtrack(answer, "", 0, 0, n)
    return answer
}

fun backtrack(answer: MutableList<String>, str: String, open: Int, close: Int, max: Int) {
    if (str.length == max * 2) {
        answer.add(str)
        return
    }

    if (open < max) {
        backtrack(answer, "${str}(", open + 1, close, max)
    }
    if (close < open) {
        backtrack(answer, "${str})", open, close + 1, max)
    }
}