package com.zxl.dp;

public class Coin2 {
	
	/**
	 * 给定v1 v2  vn面值的硬币，给定一个面值，返回给面值最多硬币和最少硬币
	 * 背包问题 
	 */
	public int[] getMinAndMax(int s ,int[] v){
		int[] min = new int[s+1];
		int[] max = new int[s+1] ;
		min[0] =0 ;
		max[0] =0 ;
		for(int i=1 ;i<=s;i++){
			min[i] =Integer.MAX_VALUE;
			max[i]=Integer.MIN_VALUE ;
			for(int j=0;j<v.length;j++){
				if(i>v[j]){
					if(min[i-v[j]]+1<min[i]){
						min[i] =min[i-v[j]]+1;
					}
					if(max[i-v[j]]+1>max[i]){
						max[i] =max[i-v[j]]+1;
					}
				}
			}
		}
		return new int[]{min[s],max[s]};
	}
}
