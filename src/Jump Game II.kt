import kotlin.math.max

class `Jump Game II` {
    fun jump(nums: IntArray): Int {
        var ans = 0
        var curEnd = 0
        var curFar = 0
        for (i in 0 until nums.size-1) {
            curFar = max(curFar, i + nums[i])
            //採的步數剛好等於最遠距離,如果curFar超過了nums.size-1那就代表已經超過了
            //這一題沒有要求要剛好,所以用貪婪演算法就可以了,難在curEnd的計算
            if (i == curEnd) {
                ans++
                curEnd = curFar
            }
        }
        return ans
    }

}