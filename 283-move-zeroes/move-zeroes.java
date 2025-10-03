class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int count=0,j=0;
        for(int num:nums){
            if(num==0) count++;
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        while(j<n){
            nums[j]=0;
            j++;
        }
        return;
    }
}