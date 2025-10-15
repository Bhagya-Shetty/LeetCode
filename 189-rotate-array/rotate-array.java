class Solution {
    public void reverse(int[] nums,int start,int end){
        while(start<end){
            nums[start]=nums[start]+nums[end];
            nums[end]=nums[start]-nums[end];
            nums[start]=nums[start]-nums[end];
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int j=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,j-1);
        reverse(nums,j,n-1);
    }
}