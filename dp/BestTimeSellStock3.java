package com.zxl.dp;

public class BestTimeSellStock3 {
	/**
	 * 给定一个数组，代表股票的价格，最多买卖两次，每天不能进行重复交易
	 * 思路：用一个二维数组，表示进行在第i天，进行第k个交易
	 * 条件转换为  dp[k][i] = max(dp[k][i-1],p[i]-p[j]+dp[k-1][j-1])
	 * @param prices
	 * @return
	 */
	public int maxProfit(int[] prices){
		if(prices==null||prices.length<2) return 0;
		int[][] dp = new int[3][prices.length] ;
		for(int k=1 ;k<=2 ;k++){
			int min = prices[0] ;
			for(int i = 1 ;i<prices.length;i++){
				min = Math.min(min, prices[i]-dp[k-1][i-1]);
				dp[k][i] = Math.max(dp[k][i-1], prices[i]-min) ;
			}
		}
		return dp[2][prices.length-1] ;
	}
}
