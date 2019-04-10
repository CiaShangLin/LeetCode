class twoSum {
    //Accepted	2036 ms	43 MB	kotlin
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var map = mutableMapOf<Int,IntArray>()
        for (i in 0..nums.size-1) {
            for (j in i + 1..nums.size-1) {
                var total =nums[i]+nums[j]
                map.put(total,intArrayOf(i,j))
            }
        }
        return map.get(target)!!
    }

    //Accepted	188 ms	38.1 MB	kotlin
    fun better(nums: IntArray, target: Int): IntArray {
        //先跟targer相減然後放進去Map裡面 接著去判斷 這樣只有O(n)
        val result = IntArray(2)
        val map = hashMapOf<Int, Int>()
        nums.forEachIndexed { index, i ->
            val v = target - i
            //containsKey確認map裡面有沒有這個key了
            if (map.containsKey(v)) {
                result[0] = map[v]!!
                result[1] = index
                return result
            } else {
                map.put(i, index)
            }
        }
        return result
    }
}

