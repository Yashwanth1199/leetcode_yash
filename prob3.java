// // A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height.
//  Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

// // You are given an integer array heights representing the current order that the students 
// are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

// // Return the number of indices where heights[i] != expected[i].
// Input: heights = [1,1,4,2,1,3]
// Output: 3
// Explanation: 
// heights:  [1,1,4,2,1,3]
// expected: [1,1,1,2,3,4]
// Indices 2, 4, and 5 do not match.
import java.util.Arrays;
class Solution {
    public int heightChecker(int[] heights) {
        int expected[]=heights.clone(); //duplicated the input array into expected 
        Arrays.sort(expected);//sorted it using the sort method from Arrays class
        int k=0;//intialized k to zero for returning us the number of indices that do not match 
        for(int i=0;i<heights.length;i++){//looping through both the arrays 
            if(heights[i]!=expected[i]){//if the indices doesn't match 
                k++;//incrementing the k by 1
            }
        }
        return k;
    }
}

class HelloWorld {
    public static void main(String[] args) {
        int heights[]={1,1,4,2,1,3};
        Solution s= new Solution();
        int o=s.heightChecker(heights);
        System.out.print(o);
    }
}
