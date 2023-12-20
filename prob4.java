// Given an array of integers of size ‘n’, Our aim is to calculate the maximum sum of ‘k’ consecutive elements in the array.

// Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4 
// Output : 39
// We get maximum sum by adding subarray {4, 2, 10, 23} of size 4
// Used Sliding Technique 
class Solution{
    public int maxSum(int[]nums,int k){
        int max_sum=0;//variable for total sum
        for(int i=0;i<k;i++){//first loop for calculating sum of first k elements
            max_sum+=nums[i];
        }
        int window_sum=max_sum;//creating a second variable to subtract(i-kth element) and add the(ith element) 
        for(int i=k;i<nums.length;i++){
            window_sum+=nums[i]-nums[i-k];
            max_sum=Math.max(window_sum,max_sum);//Math function for max among both variables
        }
        return max_sum;
    }
}
class Demo{
    public static void main(String[]args){
        int[]nums={ 1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k=4;
        Solution s= new Solution();
        System.out.print(s.maxSum(nums,k));
    }
}