public class MaxProfit {
    public static void main(String args[]){
		int [] nums = new int [] {7,1,5,3,6,4} ;
		maxProfit(nums) ;
	}
	
	public static int maxProfit(int[] prices) {
        int profit = 0 ;
        for(int i = 0 ; i < prices.length - 1 ; i++){
            if(prices[i + 1] > prices[i])
                profit += (prices[i + 1]- prices[i]) ;  // ̰�ģ���һ��ӯ���ͼ�һ��
        }
		System.out.print("�������Ϊ��" + profit) ;
		return profit ;
    }
}