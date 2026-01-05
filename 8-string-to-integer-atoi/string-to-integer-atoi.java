class Solution {
    public int myAtoi(String s) {
        int i=0,sign=1;
        long num=0;
        while(i<s.length()&&s.charAt(i)==' '){
            i++;
        }
        if(i==s.length()) return 0;
        if(s.charAt(i)=='-'||s.charAt(i)=='+'){
            if(s.charAt(i)=='-'){
                sign=-1;
            }
            i++;
        }
        while(i<s.length()&&s.charAt(i)>=48&&s.charAt(i)<=57){
            int n=s.charAt(i)-'0';
            num=(num*10)+n;
            if(sign==1&&num>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign==-1&&-num<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)(sign*num);
    }
}