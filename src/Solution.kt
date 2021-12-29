fun main(args: Array<String>) {

    val n1=ListNode(1)
    n1.next=ListNode(2)

    val n2=ListNode(3)
    n2.next=ListNode(4)

    var n3 = mergeTwoLists(n1,n2)
    while(n3!=null){
        print("${n3.`val`} ")
        n3=n3.next

    }
}
