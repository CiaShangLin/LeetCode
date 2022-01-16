class removeNthFromEnd {
}

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    val list = mutableListOf<Int>()

    var temp = head
    while (temp != null) {
        list.add(temp.`val`)
        temp = temp.next
    }
    list.removeAt(list.size-n)
    if(list.isEmpty()){
        return null
    }

    var h = ListNode(list[0])
    val t = h
    list.subList(1,list.size).forEach {
        h.next = ListNode(it)
        h=h.next!!
    }

    return t
}