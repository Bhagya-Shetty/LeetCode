class Solution {
    public boolean lemonadeChange(int[] bills) {
        int b=bills.length;
        int five=0,ten=0;
        for(int i=0;i<b;i++){
            if(bills[i]==5) five++;
            else if(bills[i]==10){
                ten++;
                five--;
            }
            else{
                if(ten>0){
                    ten--;
                    five--;
                }
                else{
                    five-=3;
                }
            }
            if(ten<0||five<0) return false;
        }
        return true;
    }
}