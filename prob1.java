//Sort Array by Parity
//Even nums first followed by odd nums
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int e=0;//intializing a var to 0 to replace it with even elements using it as an index of array nums
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                //basic swapping technique using third var
                int temp=nums[i];
                nums[i]=nums[e];
                nums[e++]=temp;//incrementing e everytime the control comes in here
            }
        }
        return nums;
    }
}
class Demo{
    public static void main(String[] args) {
        int nums[]={3,1,2,4};
        Solution s= new Solution();
        int n[]=s.sortArrayByParity(nums);
        for(int p:n){
            System.out.print(p+" ");
        }
    }
}
