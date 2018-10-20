package com.zxl.math;

public class ReverseInteger {
	/**
	 * 核心就是处理越界问题。
	 * 对于越界问题，用long或者看是否超过最大值
	 * @param num
	 * @return
	 */
	public static int reverse(int num){
		int sign = num<0?-1:1 ;
		int temp =sign*num ;
		int res =0 ;
		while(temp>0){
			int digit = temp%10 ;
			if(res>Integer.MAX_VALUE/10||
					(res<Integer.MIN_VALUE/10&&digit>Integer.MAX_VALUE%10)){
				return 0 ;
			}
			res = res*10+digit ;
			temp = temp/10 ;
		}
		return res*sign ;
	}
	
	public static void main(String[] args) {
		System.out.println(reverse(-10009));
	}
}
