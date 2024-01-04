class Solution {
    public int[] twoSum(int[] nums, int target) {
        int k[]=new int[2];//created a new array to store the output
        for(int i=0;i<nums.length;i++){//first loop
            for(int j=i+1;j<nums.length;j++){//second loop
                int sum=nums[i]+nums[j];//checking jth elements with ith element by adding
                if(sum==target){//and if satisfies
                    k[0]=i;//storing the output with indexes
                    k[1]=j;
                }
            }
        }
        return k;
    }
}