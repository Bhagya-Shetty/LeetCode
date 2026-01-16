class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        char ch;
        for(int i=0;i<strs[0].length();i++){
            ch=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                String s=strs[j];
                if(i>=s.length()||s.charAt(i)!=ch) return sb.toString();
            }
            sb.append(ch);
        }
        return sb.toString();
}
}

