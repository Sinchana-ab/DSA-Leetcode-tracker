
//Given two sorted arrays nums1 and nums2 of size m and n respectively,
// return the median of the two sorted arrays.
//The overall run time complexity should be O(log (m+n))

import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int s = m+n;
        int[] arr= new int[s];
        int i =0,j = 0, k =0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                arr[k] = nums1[i];
                i++;
            }
            else{
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            arr[k++] = nums1[i++];
        }
        while (j < m) {
            arr[k++] = nums2[j++];
        }
        System.out.println(Arrays.toString(arr));
       if(s % 2 != 0){
        return (double)arr[(s)/2];
       }
       else {
            return (arr[s / 2 - 1] + arr[s / 2]) / 2.0;
        }
    }
    public static void main(String[] args) {
        Solution a = new Solution();
        int[] arr= {1,2,3,4,5};
        int[] arr1 = {1,3,6,7,8,9};
        double n = a.findMedianSortedArrays(arr,arr1);
        System.out.println("the median of two sorted array is "+n);
    }
}