class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int small=1;
        int i=0;
        while(i<nums.length){
            if(nums[i]<=0) i++;
            else{
                if(nums[i]==small){
                    i++;
                    if(i==nums.length||nums[i]!=nums[i-1]) small++;
                }
                else return small;
            }
    }
    return small;
    }
}