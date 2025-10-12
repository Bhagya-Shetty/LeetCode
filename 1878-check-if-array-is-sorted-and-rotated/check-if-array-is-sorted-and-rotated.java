class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int sorted=0;
        for(int i=1;i<=n;i++){
            sorted=1;
            for(int j=1;j<n;j++){
                if(nums[j]<nums[j-1]){
                    int temp=nums[0];
                    for(int k=0;k<n-1;k++){
                        nums[k]=nums[k+1];
                    }
                    nums[n-1]=temp;
                    sorted=0;
                }
        }
        if(sorted==1) break;
    }
    return (sorted==1? true:false);
}
}