public class MaxProfit {
    public static void main(String args[]){
		int [] nums = new int [] {7,1,5,3,6,4} ;
		maxProfit(nums) ;
	}
	
	public static int maxProfit(int[] prices) {
        int profit = 0 ;
        for(int i = 0 ; i < prices.length - 1 ; i++){
            if(prices[i + 1] > prices[i])
                profit += (prices[i + 1]- prices[i]) ;  // 贪心，有一次盈利就加一次
        }
		System.out.print("最高利润为：" + profit) ;
		return profit ;
    }
}