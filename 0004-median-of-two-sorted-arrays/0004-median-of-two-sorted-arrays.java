class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      
        int n=nums1.length;
        int m=nums2.length;
            int [] res=new int[n+m];
        int left=0;int right=0;int index=0;
        while(left<n && right<m){
            if(nums1[left]<=nums2[right]){
                res[index]=nums1[left];
                index++;left++;
            }
            else{
                res[index]=nums2[right];
            index++;right++;
            }}
        while(left<n){
            res[index]=nums1[left];
            index++;left++;
        }
        while(right<m){
            res[index]=nums2[right];
            index++;right++;

        }
        int size=n+m;
              if(size % 2 == 1) {
            return res[size / 2];
        }

        // Even length
        else {

            return (res[size/2] + res[(size/2)-1]) / 2.0;
        }
    }
}
