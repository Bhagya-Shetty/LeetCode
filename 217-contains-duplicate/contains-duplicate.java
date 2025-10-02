class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> count=new HashSet<>();
        for(int num:nums){
            if(count.contains(num)){
                return true;
            }
            else{
                count.add(num);
            }
        }
        return false;
    }
}

