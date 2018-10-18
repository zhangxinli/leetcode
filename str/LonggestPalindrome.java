package com.zxl.str;

public class LonggestPalindrome {
	/**
	 * 核心就是找到有多少对相同字母
	 * @param s
	 * @return
	 */
	public static int getLongestPalindrome(String s){
		int[] temp = new int[60] ;
		int res = 0 ;
		if(s==null) return res;
		for(int i =0 ;i<s.length() ;i++){
			int digit = s.charAt(i)-'A';
			
			if(temp[digit]%2==1){
				res++ ;
				res++ ;
			}
			temp[digit]++ ;
		}
		return s.length()==res?res:res+1 ;
	}
	
	public static void main(String[] args) {
		System.out.println(getLongestPalindrome("abccccdd"));
	}
}
