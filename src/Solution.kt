fun main(args: Array<String>) {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var listNode1 = l1
        var listNode2 = l2

        //回傳headerNode才會顯示全部的Node
        var headerNode: ListNode? = null
        var listNode: ListNode? = null
        var carry: Int = 0
        while (listNode1 != null || listNode2 != null) {
            var value1: Int = if (listNode1 == null) 0 else listNode1.`val`
            var value2: Int = if (listNode2 == null) 0 else listNode2.`val`
            var total: Int = (value1 + value2)
            if (carry > 0)
                total += carry

            if (listNode == null) {
                listNode = ListNode(total % 10)
                headerNode=listNode
            } else {
                listNode.next = ListNode(total % 10)
                listNode = listNode.next
            }
            carry = total / 10

            listNode1 = listNode1?.next
            listNode2 = listNode2?.next
        }

        //當兩個最後的位數相加完 還有進位的情況下
        if (carry > 0)
            listNode?.next = ListNode(carry)
        return headerNode
    }

}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}


