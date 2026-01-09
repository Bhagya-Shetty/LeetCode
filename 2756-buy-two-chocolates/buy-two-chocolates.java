class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int i=0;
        int bill=prices[0]+prices[1];
        if(bill<=money) return money-bill;
        else return money;
    }
}