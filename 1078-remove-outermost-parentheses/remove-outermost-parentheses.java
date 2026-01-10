class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        //Stack<Character> stack=new Stack<Character>();
        //char c;
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(char c : s.toCharArray()){
            if(c=='(' && count==0){
                count++;
            }
            else if(c=='(' && count!=0){
                count++;
                sb.append(c);
            }
            else{
                count--;

                if(count!=0){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}