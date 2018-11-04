package com.zxl.dp;

public class BestTimeSellStock4 {
	/**
	 * 给定一个数组，代表股票的价格，最多买卖k次，每天不能进行重复交易
	 * 思路：用一个二维数组，表示进行在第i天，进行第k个交易
	 * 条件转换为  dp[k][i] = max(dp[k][i-1],p[i]-p[j]+dp[k-1][j-1])
	 * 唯一需要考虑的是次数k太多，超过prices的一般，就尅考虑i小于i+1就可以交易
	 * @param prices
	 * @return
	 */
	  public int maxProfit(int count, int[] prices) {
	        if(prices==null||prices.length<2) return 0;
	        int len =prices.length ;
	        if (count >= len / 2) return quickSolve(prices);
			int[][] dp = new int[count+1][prices.length] ;
			for(int k=1 ;k<=count ;k++){
				int min = prices[0] ;
				for(int i = 1 ;i<prices.length;i++){
					min = Math.min(min, prices[i]-dp[k-1][i-1]);
					dp[k][i] = Math.max(dp[k][i-1], prices[i]-min) ;
				}
			}
			return dp[count][prices.length-1] ;
	    }
	     private int quickSolve(int[] prices) {
	        int len = prices.length, profit = 0;
	        for (int i = 1; i < len; i++)
	            // as long as there is a price gap, we gain a profit.
	            if (prices[i] > prices[i - 1]) profit += prices[i] - prices[i - 1];
	        return profit;
	    }
}
