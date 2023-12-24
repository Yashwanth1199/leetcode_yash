//binary search
class Solution{
    public int binarySearch(int[]nums,int l,int r,int t){
        while(l<=r){//running this loop until both the left pointer and right pointer meet
            int m=l+(r-l)/2;//getting the middle element everytime we iterate and check if it matches our target element
            if(nums[m]==t){//if element found 
                return m;//we'll be returning the index
            }
            else if(t>nums[m]){//if the target element is greater than the middle element, the element must lie on the right index
                l=m+1;//and so we'll be focusing on the right elements itself bringing the left pointer to next the middle pointer
            }
            else{
                r=m-1;//else the target element must lie to the left index and so we'll be putting the right pointer before the middle pointer
            }
        }//we'll be continuing this operation until the condition satisfies and therefore we would have checked all the elements
         return -1;//after all this if we don't find the element then target element doesn't exist in our array hence return -1
    }
   
}
class HelloWorld {
    public static void main(String[] args) {
        Solution s= new Solution();
        int []nums={2, 3, 4, 10, 40};
        int l=0;
        int r=nums.length-1;
        int t=10;
        int result=s.binarySearch(nums,l,r,t);
        if(result==-1){
            System.out.print("element not found!");
        }
        else{
            System.out.print("Element found at index "+result);
        }
    }
}