class `Merge Two Sorted Lists` {
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    var tempList1 = list1
    var tempList2 = list2
    var total = ListNode(0)
    val head = total

    while (tempList1 != null && tempList2 != null) {
        val left = tempList1.`val`
        val right = tempList2.`val`

        if (left < right) {
            total.next = ListNode(left)
            total = total.next!!
            tempList1 = tempList1.next
        } else {
            total.next = ListNode(right)
            total = total.next!!
            tempList2 = tempList2.next
        }
    }

    if (tempList1 != null) {
        total.next = tempList1
    }
    if (tempList2 != null) {
        total.next = tempList2
    }
    return head.next
}