package com.zxl.dp;

public class Coin {
	
	public static int getMinCoin(int n){
		if(n==0) return 0 ;
		int[] d = new int[n+1];
		d[0] =0 ;
		for(int i=1 ;i<=n;i++){
			int coin1 = i-1 ;
			int min = d[coin1]+1 ;
			
			int coin3 = i -3 ;
			if(coin3>=0){
				min=min>d[coin3]+1?d[coin3]+1:min;
			}
			int coin5 = i -5 ;
			if(coin5>=0){
				min=min>d[coin5]+1?d[coin5]+1:min;
			}
			System.out.println(min);
			d[i]= min ;
		}
		
		return d[n] ;
	}
	
	public static void main(String[] args) {
		for(int i =2;i<=10;i++){
			System.out.println(i+"_________________________________");
			getMinCoin(i);
			
		}
		
	}
}
