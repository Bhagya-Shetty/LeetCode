class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        if (n%2!=0) return false;
        Stack<Character> stack= new Stack<Character>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[') stack.push(s.charAt(i));
            else{
                if(stack.isEmpty()) return false;
                char top=stack.pop();
                if(top=='['&&s.charAt(i)==']'||top=='{'&&s.charAt(i)=='}'||top=='('&&s.charAt(i)==')') continue;
                else return false;
            }
        }
        return stack.isEmpty();
    }
}