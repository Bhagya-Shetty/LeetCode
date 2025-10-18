class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max;
        int sum=0;
        List<Integer> arr=new ArrayList<>();
        for(int num:nums){
            if(num==1){
            sum+=num;
            }
            else{
                arr.add(sum);
                sum=0;
            }
        }
        arr.add(sum);
        max=Collections.max(arr);
        return max;
    }
}