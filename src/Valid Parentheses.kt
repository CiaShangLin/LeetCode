import java.util.*

class `Valid Parentheses` {
}

fun isValid(s: String): Boolean {

    if (s.length % 2 != 0) {
        return false
    }

    val stack = Stack<Char>()

    for (i in s.length - 1 downTo 0) {
        if (s[i] == '}' || s[i] == ')' || s[i] == ']') {
            stack.push(s[i])
        } else {
            if (stack.size == 0) {
                return false
            }
            val right = stack.pop()
            if (right == ')' && s[i] == '(') {

            } else if (right == ']' && s[i] == '[') {

            } else if (right == '}' && s[i] == '{') {

            } else {
                return false
            }
        }
    }
    return stack.isEmpty()
}