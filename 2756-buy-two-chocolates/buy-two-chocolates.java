class Solution {
    public int buyChoco(int[] prices, int money) {
        int min=0,rem=0,flag=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<prices[min]) min=i;
        }
        int after_one=money-prices[min];
        for(int j=0;j<prices.length;j++){
            if(j==min) continue;
            if(prices[j]<=after_one&&after_one-prices[j]>=rem){
                rem=after_one-prices[j];
                flag=1;
            }
        } 
        if (flag==1) return rem;
        else return money;
    }
}