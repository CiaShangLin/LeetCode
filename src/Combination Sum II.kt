/**
 * 一樣是遞迴DSF解難在如何處理大列表和重複的數字
 * 這個是參考chatGPT寫的,BooleanArray處理的重複數字的問題真的厲害
 */
class `Combination Sum II` {

    fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
        val ans = mutableListOf<List<Int>>()
        val used = BooleanArray(candidates.size)

        candidates.sort()
        dsf(target, candidates, mutableListOf(), 0, ans, used)

        return ans
    }

    private fun dsf(target: Int, candidates: IntArray, temp: MutableList<Int>, startIndex: Int, ans: MutableList<List<Int>>, used: BooleanArray) {
        // 如果目標總和為0，表示找到一個符合的組合，將它加入到結果中
        if (target == 0) {
            ans.add(temp.toList())
            return
        }

        // 開始搜索候選數組
        for (i in startIndex until candidates.size) {
            // 如果候選數組已經排序，這個條件確保跳過相同數字的重複
            if (i > startIndex && candidates[i] == candidates[i - 1] && !used[i - 1]) {
                continue // 跳過重複
            }

            // 如果當前候選數大於目標，可以提前停止搜索，因為不可能找到符合的組合
            if (candidates[i] > target) {
                break // 停止搜索
            }

            // 將當前候選數添加到組合中
            temp.add(candidates[i])
            used[i] = true

            // 遞迴搜索下一個目標總和
            dsf(target - candidates[i], candidates, temp, i + 1, ans, used)

            // 回溯：從組合中移除當前候選數，並標記為未使用
            temp.removeAt(temp.size - 1)
            used[i] = false
        }
    }
}