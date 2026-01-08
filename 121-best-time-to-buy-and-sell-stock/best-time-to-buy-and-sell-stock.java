class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int min;
        int max_profit=0;
        while(n>1){
            min=0;
            for(int i=1;i<n;i++){
                if(prices[i]<prices[min]) min=i;
            }
            if(min!=n-1){
                for(int j=min+1;j<n;j++){
                    if(prices[j]>prices[min]&&prices[j]-prices[min]>max_profit) max_profit=prices[j]-prices[min];
        }
        n=min;
            }
            else n--;
        }
        return max_profit;
    }
}