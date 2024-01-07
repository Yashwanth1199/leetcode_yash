class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;//operating on a temporary variable
        int rev=0;//using the rev variable to store the reversed number
        if(x<0)//if given number is less than 0 it is not a palindrome
            return false; //and so false
        while(temp!=0){//while our temporary is not equal to zero
            int d=temp%10;//we'll start extracting single digit from the right
            rev=rev*10+d;//store it in rev
            temp=temp/10;//remove the single digit from the right
        }
        if(rev!=x)//if rev is not equal to the given input
            return false;//its not a palindrome hence returning false
        else
            return true;//else its a palindrome hence returning true
    }
}