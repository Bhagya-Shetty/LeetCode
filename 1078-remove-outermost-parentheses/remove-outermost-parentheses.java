class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            // if c='(' and stack is empty push 
            if(c=='('&&count==0) count++;
            // if c='(' and stack is not empty push append
            else if(c=='('&&count!=0){
                count++;
                sb.append(c);
            }
            // if c=')' pop 
            // not empty append
            else{
                count--;
                if(count!=0) sb.append(c);
            }
            }
            return sb.toString();
    }
}