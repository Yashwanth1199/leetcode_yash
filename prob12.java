class Solution {
    public int reverse(int x) {
        long temp=x; //widening of x into a temporary var
        long rev=0; //var to store the reverse
        while(temp!=0){ //until our temp becomes 0 we'll go ahead with the statements
            long d=temp%10;//extracting last digit by fetching the remainder
            rev=rev*10+d;//adding it to the rev var
            temp/=10;//removing the last digit by fetching the quotient
        }
        long max=(long)Math.pow(2,31);//signed 32bit integer range
        if(rev>max-1||rev<(max*-1)){//if the reversed value is less than -2^31 or greater than 2^31-1
            return 0;//we'll be returning 0
        }
        return (int)rev;//else we're gonna be returning the value itself
    }
}