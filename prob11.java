class Solution {
    public int[] searchRange(int[] nums, int target) {
        int fin[]={-1,-1};//final array to be returned
        int e=0;//to hold the target element count
        for(int n:nums){//looping through the input array
            if(n==target)//if equals to the target element increment by 1
                e++;
        }
        if(e==1){//if the number of target elements is 1
            for(int i=0;i<nums.length;i++){//we're gonna lookout for it 
                if(nums[i]==target){//once found
                    fin[0]=i;//starting position
                    fin[1]=i;//ending position has been initialized with the same location since there's only one element
                    break;//and we'll break out of it
                }
            }
            return fin;//returning the final array
        }
        else{//and if the target element is more than a single count
        int n=0;//variable to access final array index
        for(int i=0;i<nums.length;i++){
                if(nums[i]==target){//if the array element is equal to target
                    if(n<fin.length-1){//if its lesser than the length of the final array index
                        fin[n]=i;//we're gonna place the location there
                        n++;//increment the index by one
                    }
                    else//since the size of the final array is 2(0,1) we would've reached the end index of the final array and 
                        fin[n]=i;//we'll just keep replacing it with the location of the last found target element 
                }
            }
            return fin;
        }
    }
}