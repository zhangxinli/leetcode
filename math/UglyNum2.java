package com.zxl.math;

public class UglyNum2 {
	/**
	 * 动态规划，等今天看了动态规划在来看
	 * @param n
	 * @return
	 */
	public static int getUgly(int n){
		if(n==1) return 1 ;
		int[] res = new int[n];
		int p2=0,p3=0,p5=0,i=1;
		res[0]=1 ;
		while(i<n){
			int num2=res[p2]*2;
			int num3=res[p3]*3;
			int num5=res[p5]*5 ;
			int min =Math.min(num2, Math.min(num3, num5)) ;
			if(num2==min) p2++ ;
			if(num3==min) p3++ ;
			if(num5==min) p5++ ;
			res[i]=min;
			i++;
		}
		return res[n-1];
		
	}
	public static void main(String[] args) {
		System.out.println(getUgly(11));
	}
}
