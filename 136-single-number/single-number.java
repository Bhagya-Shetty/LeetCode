class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        //0^x=x and x^x=0
        for(int num:nums){
            res^=num;
        }
        return res;
    }
}