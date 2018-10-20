package com.zxl.math;

public class DevideNum {
	public  static int divideNum(int devidend,int devisor){
		int sign = (devidend>0)^(devisor>0)?-1:1;
		if(devidend==0) return 0 ;
		if(devisor==0) return Integer.MAX_VALUE ;
		long a =Math.abs((long)devidend);
		long b =Math.abs((long)devisor);
		long res = 0 ;
		while(a>=b){
			long devidend2 = a ;
			long devisor1 = b ;
			long i =0 ;
			while(devisor1<=devidend2){
				devisor1 =devisor1<<1 ;
				i++ ;
			}
			res += (1L<<(i-1)) ;
			a-=(devisor1>>1) ;
			
		}
		return (int)(res*sign>Integer.MAX_VALUE?Integer.MAX_VALUE:res*sign);
		
	}
	public static void main(String[] args) {
		System.out.println(divideNum(-2147483648,-1));
	}
}
