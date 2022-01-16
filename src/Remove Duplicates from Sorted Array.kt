import kotlin.math.sign

class `Remove Duplicates from Sorted Array` {
}

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var lastIndex = 1
    var temp = nums[0]
    nums.forEachIndexed { index, n ->
        if (nums[index] > temp) {
            temp = nums[index]
            nums[lastIndex] = nums[index]
            lastIndex++
        }
    }
    return lastIndex
}