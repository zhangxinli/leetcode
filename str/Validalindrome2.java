package com.zxl.str;

public class Validalindrome2 {
	/**
	 * 从两边遍历，遇到不相等让i++ 或者j-- 看是否为回文
	 * @param s
	 * @return
	 */
	public static boolean validPalindrome(String s) {
		return isPalindrome(s,false) ;
    }
	
	public static boolean isPalindrome(String s,boolean isDel){
			if(s.length()==1) return true;
	        int i = 0 ,j =s.length()-1;
	        
	        while(i<j){
	        	while(i<j&&s.charAt(i)==s.charAt(j)){
	        		i++;
	        		j-- ;
	        	}
	        	if(i<j){
	        		if((!isDel)&& s.charAt(i+1)==s.charAt(j)){
	        			if(isPalindrome(s.substring(i+1,j+1),true)) return true;
	        		}
	        		if((!isDel)&& s.charAt(i)==s.charAt(j-1)){
	        			if(isPalindrome(s.substring(i,j),true)) return true;		        	
	        		}	
	        		return false ;
	        	}
	        }
	        return true;
	}
	
	public static void main(String[] args) {
		System.out.println(validPalindrome("deeee"));
	}
}
