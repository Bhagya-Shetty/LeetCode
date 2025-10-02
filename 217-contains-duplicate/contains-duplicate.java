class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> count=new HashSet<>();
        for(int num:nums){
            if(!count.add(num)){
                return true;
            }
        }
        return false;
    }
}

