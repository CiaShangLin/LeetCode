class `Palindrome Number` {
    fun isPalindrome(x: Int): Boolean {
        var str = x.toString()
        var length = str.length

        var left=""
        var right=""
        if(length%2==0){
            left=str.substring(0,length/2)
            right=str.substring(length/2,length)
        }else{
            left=str.substring(0,length/2)
            right=str.substring(length/2+1,length)
        }


        return left.equals(right.reversed())
    }

    fun best(x: Int):Boolean{
        var x=x
        var  reversed=0

        if(x<0 || (x%10==0 && x!=0)){
            return false
        }
        while(x>reversed){
            reversed=reversed*10+x%10
            x=x/10
        }
        return reversed==x || reversed/10==x
    }
}