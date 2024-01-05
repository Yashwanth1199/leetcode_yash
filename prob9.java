import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double nums3[]=new double[nums1.length+nums2.length];//creating a new array to store the merged arrays values altogether as double(widening)
        double median=0;//goal is to return the median of the array
        int k=0,i=0;
        while(i<nums1.length){//inserting the nums1 elements
            nums3[k]=nums1[i];
            i++;//i to iterate through the nums1 elements
            k++;//k to insert the elements in nums3 starting from 0th index
        }
        i=0;//reusing the variable by reassigning it to 0
        while(i<nums2.length){
            nums3[k]=nums2[i];
            i++;//i again to iterate through the nums2 elements
            k++;//starting k from last stored index
        }
        Arrays.sort(nums3);//sorting the array
        int n=nums3.length;
        if(n%2==0){//if even then there shall be two middle elements hence add them up and divide by 2
            median=(nums3[n/2-1]+nums3[n/2])/2;
        }
        else{//if odd the middle most element shall be the median
            median=nums3[n/2];
        }
        return median;
    }
}