class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        Stack<Character> stack=new Stack<Character>();
        char c;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            c=s.charAt(i);
            if(c=='('&&stack.isEmpty()){
                stack.push(c);
            }
            else if(c=='('&&!stack.isEmpty()){
                stack.push(c);
                sb.append(c);
            }
            else{
                stack.pop();
                if(!stack.isEmpty()){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}