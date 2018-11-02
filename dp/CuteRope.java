package com.zxl.dp;

public class CuteRope {
	/**
	 * 一段长度为n的绳子，分成m段，求这m段最大 的乘机
	 * 列出初始条件找规律
	 * 1 —>1 2->1 3-->2*1 4->2*2 5->2*3 6->4*2 
	 * 自己没想出来是因为2 ，3 的特殊情
	 */
	
	public int getMax(int n){
		if(n<=0) return 0;
		if(n==1) return 1 ;
		if(n==2) return 1 ;
		if(n==3) return 2 ;
		int[] dp = new int[255] ;
		dp[1] =1 ;
		dp[2] =2 ;
		dp[3] =3 ;
		for(int i =4;i<=n;i++){
			int max = 0 ;
			for(int j =0 ;j<i/2+1;j++){
				if(max<dp[j]*dp[i-j]){
					max= dp[j]*dp[i-j];
				}
			}
			dp[i] =max ;
		}
		return dp[n] ;
	}
}
