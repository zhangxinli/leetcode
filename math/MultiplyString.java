package com.zxl.math;

public class MultiplyString {
	public String multiplyString(String str1,String str2){
		int m= str1.length();
		int n = str2.length();
		int[] temp = new int[m+n] ;
		for(int i=m-1;i>=0;i--){
			for(int j=n-1;j>=0;j--){
				int digit = (str1.charAt(i)-'0')*(str2.charAt(j)-'0') ;
				int p1 = i+j;
				int p2=i+j+1 ;
				int sum = digit+temp[p2] ;
				temp[p1]+=sum/10 ;
				temp[p2]=sum%10 ;
			}
		}
		StringBuffer sb = new StringBuffer() ;
		for(int p :temp){
			if(!(sb.length()==0&&p==0)){
				sb.append(p);
			}
		}
		return sb.length()==0?"0":sb.toString();
	}
}
