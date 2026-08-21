class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int k=0;
        int l=nums.length-1;
        while(k<l){
            if(nums[k]%2==0){
                
                k++;
            }
            else if(nums[l]%2!=0){
                l--;
            }
            else{
                int temp=nums[k];
                nums[k]=nums[l];
                nums[l]=temp;
                k++;
                l--;
            }
        }
        return nums;
    }
}