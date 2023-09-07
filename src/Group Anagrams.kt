/**
 * 分組排序
 * 透過sort和map的效果來分組
 */
class `Group Anagrams` {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String, MutableList<String>>()
        strs.forEach {
            val sort = it.toCharArray().sorted().toString()
            if (map[sort] == null) {
                map[sort] = mutableListOf<String>().apply {
                    this.add(it)
                }
            } else {
                map[sort]?.add(it)
            }
        }
        return map.values.toList()
    }
}