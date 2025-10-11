class Solution {
    public int singleNumber(int[] nums) {
        int number=0;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                set.remove(num);
        }
            else{
                set.add(num);
        }
        }
        for(int val:set){
            number=val;
        }
        return number;
}
}