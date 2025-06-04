public class Q13_JUNE_04_Buy_SellStocks {
    public static int maxProfit(int prices[]){
        //Sliding window approach
        int maxProfit = 0;
        int left = 0;
        int right = 1;

        while(right < prices.length){
            if(prices[left] < prices[right]){
                maxProfit = Math.max(maxProfit,prices[right] - prices[left]);
            }else{
                left = right;
            }
            right++;
        }   
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int res = maxProfit(prices);
        System.out.println(res);
    }
}
