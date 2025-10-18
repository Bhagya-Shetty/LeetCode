class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,sum=0;
        for(int num:nums){
            if(num==1){
                sum+=num;
                max=Math.max(sum,max);
            }
            else{
                sum=0;
            }
        }
        return max;
    }
}