import java.util.*;
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(n==0||n==1) return;
        int j=k%n;
        if(j==0) return;
        reverse(nums,0,n-1);
        reverse(nums,0,j-1);
        reverse(nums,j,n-1);
    }

    public void reverse(int[] nums,int start,int end){
        while(start<end){
            nums[start]=nums[start]+nums[end];
            nums[end]=nums[start]-nums[end];
            nums[start]=nums[start]-nums[end];
            start++;
            end--;
        }
    }
}