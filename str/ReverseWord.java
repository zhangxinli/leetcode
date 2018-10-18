package com.zxl.str;

public class ReverseWord {
	/**
	 * 从后往前遍历，找到每个单词，关键是找到空格
	 * 开会我以为这是字母，用的是isLetter,后来发现还有数字改为isLetterOfDigit
	 * 最后其实只需要找到空格isWhiteSpace
	 * @param str
	 * @return
	 */
	public static String reverseWord(String str){
		StringBuffer sb = new StringBuffer() ;
		int start = str.length()-1 ;
		int end = str.length()-1 ;
		for(int i =str.length()-1;i>=0 ;i-- ){
			while(i>=0&&Character.isWhitespace(str.charAt(i))){
				i--;
			}
			end = i+1 ;
			while(i>=0&&!Character.isWhitespace(str.charAt(i))){
				i--;
			}
			start =i+1 ;
			sb.append(str.substring(start, end)).append(" ") ;
		}
		return sb.toString().trim() ;
	}
	
	public static void main(String[] args) {
		reverseWord("the sky is blue");
	}
}
