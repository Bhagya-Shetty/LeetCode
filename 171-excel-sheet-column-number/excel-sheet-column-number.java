class Solution {
    public int titleToNumber(String columnTitle) {
        int n=columnTitle.length();
        int num=0;
        for(int i=0;i<n;i++){
            int val=columnTitle.charAt(i)-'A'+1;
            num=num*26+val;
        }
        return num;
    }
}