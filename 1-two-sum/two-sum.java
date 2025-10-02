class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        int n=nums.length;
        outer:for(int i=0;i<n-1;i++){
            inner:for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    break outer;
                }
            }
        }
        return ans;
    }
}