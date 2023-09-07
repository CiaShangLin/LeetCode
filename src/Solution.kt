fun main(args: Array<String>) {
//    combinationSum(intArrayOf(3,5,8),11)
    val list = mutableListOf<IntArray>()
    list.add(IntArray(4).apply {
        this[0]=5
        this[1]=1
        this[2]=9
        this[3]=11
    })
    list.add(IntArray(4).apply {
        this[0]=2
        this[1]=4
        this[2]=8
        this[3]=10
    })
    list.add(IntArray(4).apply {
        this[0]=13
        this[1]=3
        this[2]=6
        this[3]=7
    })
    list.add(IntArray(4).apply {
        this[0]=15
        this[1]=14
        this[2]=12
        this[3]=16
    })

    println(`Rotate Image`().rotate(list.toTypedArray()))
}
