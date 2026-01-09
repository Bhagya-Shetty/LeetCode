class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buy,sell,profit=0,max_profit=0;
        while(n>1){
            buy=0;
            for(int i=0;i<n;i++){
            if(prices[i]<prices[buy]) buy=i;
        }
        sell=buy;
        for(int j=buy+1;j<n;j++){
            if(prices[j]>prices[sell]) sell=j;
        }
        profit=prices[sell]-prices[buy];
        if(profit>max_profit) max_profit=profit;
        n=buy;
        }
        return max_profit;
    }
}