class `3Sum` {
}

fun threeSum(nums: IntArray): List<List<Int>> {

    if (nums.size < 3) {
        return listOf()
    }
    nums.sort()

    //這題答案不受排序影響所以可以用set
    val answer = mutableSetOf<List<Int>>()

    for (i in 0 until nums.size - 1) {
        var start = i + 1
        var end = nums.size - 1
        while (start < end) {
            val sum = nums[start] + nums[end] + nums[i]
            when {
                //大於0代表減太多要縮小
                sum > 0 -> end--
                //小於0代表不夠減要放大
                sum < 0 -> start++
                else -> {
                    answer.add(listOf(nums[i], nums[start], nums[end]))
                    start += 1
                    end -= 1
                }
            }
        }
    }
    return answer.toList()
}