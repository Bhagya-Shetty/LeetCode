class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,sum=0;
        for(int num:nums){
            if(num==1) sum+=num;
            else{
                if(sum>max){
                    max=sum;
                }
                sum=0;
            }
        }
        if(sum>max) max=sum;
        return max;
    }
}