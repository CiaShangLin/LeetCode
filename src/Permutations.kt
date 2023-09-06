class Permutations {
    fun permute(nums: IntArray): List<List<Int>> {

        val ans = mutableListOf<List<Int>>()
        val used = BooleanArray(nums.size)
        dsf(nums, mutableListOf(), ans, used)

        return ans
    }

    private fun dsf(nums: IntArray, temp: MutableList<Int>, ans: MutableList<List<Int>>, used: BooleanArray) {
        // 如果排列已經包含了所有數字，則將其添加到結果中
        if (temp.size == nums.size) {
            ans.add(temp.toList())
            return
        }
        println(temp.toList())
        for (i in nums.indices) {
            if (used[i]) {
                // 如果數字已經在排列中，則跳過
                continue
            }
            // 將數字添加到當前排列
            used[i] = true
            temp.add(nums[i])
            // 遞迴生成下一個排列
            dsf(nums, temp, ans, used)
            // 回溯：恢復當前排列和使用狀態
            temp.removeLast()
            used[i] = false
        }
    }
}