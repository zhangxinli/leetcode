package com.zxl.str;

public class VaildPalindrome {
	/**
	 * 回文算法的核心从两头遍历，不相等就不是回文
	 * 还要就是Character.isLeeterOrDigit() 和Character.toLowerCase()
	 * @param str
	 * @return
	 */
	public Boolean isVaildPalindrome(String str){
		if(str==null || str.length() ==0) return false ;
		int i =0 ,j = str.length()-1 ;
		str = str.toLowerCase();
		while(i<j){
			while(i<j&& !Character.isLetterOrDigit(str.charAt(i))) i++ ;
			while(i<j &&  !Character.isLetterOrDigit(str.charAt(j)))j--;
			if(str.charAt(i)!=str.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}
}
