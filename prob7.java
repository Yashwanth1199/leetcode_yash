//fibonacci series
import java.util.*;
class Solution{
    public int FN(int n){
        int n1=0;//we need to calculate the fibo series from 0
        int n2=1;//followed by 1
        for(int i=1;i<=n;i++){//we'll be looping it all the way till the user's entered number
            int n3=n1+n2;//adding the last two numbers 
            n1=n2;//replacing n1 with n2
            n2=n3;//follwed by n2 with n3
        }
        return n1;//n1's output based on the user's input where we proccessed n and calculated F(n)
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Solution so=new Solution();
        int n=s.nextInt();
        int result=so.FN(n);
        System.out.print(result);
    }
}