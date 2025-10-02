class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>sum=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val=target-nums[i];
            if(sum.containsKey(val)){
                return new int[]{sum.get(val),i};
            }
            sum.put(nums[i],i);
        }
        return new int[]{};
    }
}