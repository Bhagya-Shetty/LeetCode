class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            // if c='(' and stack is empty push 
            if(ch=='('&&count==0) count++;
            // if c='(' and stack is not empty push append
            else if(ch=='('&&count!=0){
                count++;
                sb.append(ch);
            }
            // if c=')' pop 
            // not empty append
            else{
                count--;
                if(count!=0) sb.append(ch);
            }
            }
            return sb.toString();
    }
}