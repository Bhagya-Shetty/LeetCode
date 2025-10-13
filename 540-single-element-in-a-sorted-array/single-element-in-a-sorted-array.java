class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int res=0;
        for(int i=0;i<n;i++){
            res^=nums[i];
            if((i+1)%2==0&&res!=0){
                return nums[i-1];
            }
        }
        return nums[n-1];
    }
}