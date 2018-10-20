package com.zxl.math;

public class UglyNum {
	public static boolean isUgly(int num){
		while(num>0&&num%2==0){
			num/=2;
		}
		while(num>0&&num%3==0){
			num/=3;
		}
		while(num>0&&num%5==0){
			num/=5;
		}
		return num==1;
	}
	public static void main(String[] args) {
		System.out.println(isUgly(6));
	}
}
