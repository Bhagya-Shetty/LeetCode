int maxProfit(int* prices, int pricesSize) {
    int buy=*prices,sell;
    int prof=0;
    for(int i=1;i<pricesSize;i++){
        sell=*(prices+i);
        if(buy>sell){
            buy=sell;
        }
        else{
            if(sell-buy>prof){
                prof=sell-buy;
            }
        }
    }
    return prof;
}