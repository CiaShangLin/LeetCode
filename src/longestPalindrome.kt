class longestPalindrome {
}
fun longestPalindrome(s: String): String {

    //這個寫法超時了
    //如果用原本的寫法 中心點向兩側延伸的話 會不能解決長度是偶數的回文
    //這個寫法是先跑到底 在對應靜象的另一邊
    if (s.length < 2)
        return s
    var len = s.length
    var max_left = 0
    var max_len = 1
    var right = 0
    var left = 0
    var start = 0

    while (start < len && len - start > max_len / 2) {
        left = start
        right = start
        while (right < len - 1 && s[right + 1] == s[right]) {
            ++right
        }
        start = right + 1
        while (right < len - 1 && left > 0 && s[right + 1] == s[left - 1]) {
            ++right
            --left
        }
        if (max_len < right - left + 1) {
            max_left = left
            max_len = right - left + 1
        }
    }
    return s.substring(max_left, max_len)
}