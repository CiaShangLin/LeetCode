class `3Sum Closest` {
}

fun threeSumClosest(nums: IntArray, target: Int): Int {

    nums.sort()
    var min = Int.MAX_VALUE
    val list = intArrayOf(0, 0, 0)

    for (i in 0 until nums.size - 1) {
        var start = i + 1
        var end = nums.size - 1
        while (start < end) {
            val sum = nums[start] + nums[end] + nums[i]
            when {
                //大於0代表減太多要縮小
                sum > target -> {
                    val abs = Math.abs(target - sum)
                    if (min > abs) {
                        list[0] = nums[i]
                        list[1] = nums[start]
                        list[2] = nums[end]
                        min = abs
                    }
                    end--
                }
                //小於0代表不夠減要放大
                sum < target -> {
                    val abs = Math.abs(target - sum)
                    if (min > abs) {
                        list[0] = nums[i]
                        list[1] = nums[start]
                        list[2] = nums[end]
                        min = abs
                    }
                    start++
                }
                else -> {
                    return sum
                }
            }
        }
    }
    return list[0] + list[1] + list[2]
}