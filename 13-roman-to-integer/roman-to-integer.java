class Solution {
    public int value(char c){
            switch(c){
                case 'M':return 1000;
                case 'D':return 500;
                case 'C':return 100;
                case 'L':return 50;
                case 'X':return 10;
                case 'V':return 5;
                case 'I':return 1;
                default:return 0;
            }
        }
    public int romanToInt(String s) {
        int num=0;
        for(int i=0;i<s.length();i++){
            if(i+1<s.length()&&value(s.charAt(i))<value(s.charAt(i+1))){
                int val=value(s.charAt(i+1))-value(s.charAt(i));
                num+=val;
                i++;
            }
            else{
                num+=value(s.charAt(i));
            }
        }
        return num;
    }
}