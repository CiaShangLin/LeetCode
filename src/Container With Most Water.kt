class `Container With Most Water` {

}

fun maxArea(height: IntArray): Int {
    var left = 0
    var right = height.size - 1
    var max = 0

    while (left < right) {
        val minH = Math.min(height[left], height[right])
        val w = (right - left)
        max = Math.max(max, minH * w)

        //當她比最小值還小的時候那就該移動,因為如果等於最小值的話,那就代表已經是最大了
        while (height[left] <= minH && left < right) {
            left++
        }
        while (height[right] <= minH && right > left) {
            right--
        }
    }
    return max
}
