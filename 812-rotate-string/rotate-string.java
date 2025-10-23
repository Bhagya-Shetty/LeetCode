class Solution {
    public boolean rotateString(String s, String goal) {
        int m=s.length();
        int n=goal.length();
        if(m!=n) return false;
        int j=1,k,rotate;
        for(int i=0;i<n;i++){
            rotate=1;
            if(s.charAt(i)==goal.charAt(0)){
                k=i+1;
                j=1;
                while(j<n){
                    if(s.charAt(k%m)!=goal.charAt(j)){
                        rotate=0;
                        break;
                    }
                    j++;
                    k++;
                }
                if(rotate==1) return true;
            }
        }
        return false; 
    }
}