class lengthOfLongestSubstring {
    fun lengthOfLongestSubstring(s: String): Int {
        var n: Int = s.length
        var i = 0
        var j = 0
        var num=0
        var set= mutableSetOf<Char>()
        while (i < n && j < n) {
            if(!set.contains(s.elementAt(j))){ //沒有重複的就加進去 Set是有順序性的
                set.add(s.elementAt(j++))
                num=Math.max(num,j-i)
            }else{
                set.remove(s.elementAt(i++))  //遇到重複就刪除最前面的
            }
        }
        return num

    }
}