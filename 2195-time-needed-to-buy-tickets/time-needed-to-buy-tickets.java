class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int i=0,time=0;
        int t=tickets.length;
        while(i<t&&tickets[k]!=0){
            if(tickets[i]>0){
                tickets[i]-=1;
                time++;
            }
            i=(i+1)%t;
        }
        return time;
    }
}