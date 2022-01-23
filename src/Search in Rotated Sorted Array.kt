class `Search in Rotated Sorted Array` {
}

//不太懂這題目再說什麼
fun search(nums: IntArray, target: Int): Int {
    nums.forEachIndexed { index, i ->
        if(nums[index] == target){
            return index
        }
    }
    return -1
}