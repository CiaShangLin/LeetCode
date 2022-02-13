class `Find First and Last Position of Element in Sorted Array` {
}

//用二分搜尋法對0~num.size/2找第一個,num.size/2~num.size找到第二個
fun searchRange(nums: IntArray, target: Int): IntArray {
    val answer = intArrayOf(-1, -1)
    if(nums.isEmpty()){
        return answer
    }

    answer[0]=nums.indexOfFirst {
        it == target
    }
    answer[1]=nums.indexOfLast {
        it == target
    }
    return answer
}