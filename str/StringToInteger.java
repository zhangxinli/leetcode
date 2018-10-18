package com.zxl.str;

public class StringToInteger {
	
	public static int stringToInt(String str){
		if(str==null) return 0 ;
		str = str.trim() ;
		if(str.length()==0) return 0 ;
		Boolean sign = true;
		int i = 0 ;
		if(str.charAt(i)=='-'){
			sign = false ;
			i++ ;
		}else if(str.charAt(i)=='+'){
			sign = true ;
			i++ ;
		}else if(!Character.isDigit(str.charAt(i))){
			return 0 ;
		}
		double res =0 ;
		for(;i<str.length() ;i++){
			if(!Character.isDigit(str.charAt(i))){
				break;
			}
			int num = str.charAt(i)-'0' ;
			
			res =res*10+num;
		}
		res = sign?res:res*-1 ;
		if(res>Integer.MAX_VALUE) return Integer.MAX_VALUE ;
		if(res<Integer.MIN_VALUE) return Integer.MIN_VALUE ;
		return (int)res ;
				
				
	}
	
	public static void main(String[] args) {
		System.out.println(stringToInt(" -42"));
	}
}
