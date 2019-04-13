class `Reverse Integer` {
}
fun reverse(x: Int): Int {

    //超出Int數值 要回傳0

    var flag = if (x < 0) true else false
    var reverse:Long=0
    if (flag) {
        reverse = x.toString().substring(1,x.toString().length).reversed().toLong()*-1
    }else{
        reverse=x.toString().reversed().toLong()
    }

    if(reverse>Integer.MAX_VALUE || reverse<Int.MIN_VALUE)
        return 0
    return reverse.toInt()
}