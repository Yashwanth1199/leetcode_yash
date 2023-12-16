// Remove Elements
// Input: nums = [3,2,2,3], val = 3
// Output: 2, nums = [2,2,_,_]
// Explanation: Your function should return k = 2, with the first two elements of nums being 2.
// It does not matter what you leave beyond the returned k (hence they are underscores).
class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;//intialized k as 0
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){//everytime we find value similar to val we'll be entering this
                nums[k++]=nums[i];//replace it with index kth with index ith
            }
        }
        return k;
    }
}
class HelloWorld {
    public static void main(String[] args) {
        int nums[]={3,2,2,3};
        int val=3;
        Solution s= new Solution();
        int n=s.removeElement(nums,val);
        for(int p:nums){
            System.out.print(p+" ");
        }
    }
}