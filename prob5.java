//Given an integer array nums sorted in non-decreasing order,
//return an array of the squares of each number sorted in non-decreasing order.
//example 1:
// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]
// Explanation: After squaring, the array becomes [16,1,0,9,100].
// After sorting, it becomes [0,1,9,16,100].
import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){//looping through the array
            nums[i]*=nums[i];//multiplying it twice using compound multiplication assignment operator
        }
        Arrays.sort(nums);//sorting it using sort method from Arrays class
        return nums;
    }
}