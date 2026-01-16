class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        char ch;
        for(int i=0;i<strs[0].length();i++){
            ch=strs[0].charAt(i);
            for(String s:strs){
                if(i>=s.length()) return sb.toString();
                if(s.charAt(i)!=ch) return sb.toString();
            }
            sb.append(ch);
        }
        return sb.toString();
}
}

