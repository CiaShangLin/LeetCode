class `Combination Sum` {
}

fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {

    candidates.sort()
    val answer = mutableListOf<List<Int>>()

    candidates.forEachIndexed { index, value ->
        sum(index, mutableListOf(), candidates, target, answer)
    }

    return answer
}

fun sum(start: Int, list: MutableList<Int>, candidates: IntArray, target: Int, answer: MutableList<List<Int>>) {
    val m = mutableListOf<Int>()
    m.addAll(list)
    m.add(candidates[start])
    val total = m.sum()

    if (total == target) {
        answer.add(m)
        return
    }
    if (start >= candidates.size || total > target) {
        return
    }
    for (i in start until candidates.size) {
        sum(i, m, candidates, target, answer)
    }
}