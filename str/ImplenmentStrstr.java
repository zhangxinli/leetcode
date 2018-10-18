package com.zxl.str;

public class ImplenmentStrstr {
	/**
	 * 暴力遍历
	 * @param haystack
	 * @param needle
	 * @return
	 */
	public int strStr(String haystack, String needle) {
        int m = needle.length() ;
        int n = haystack.length() ;
        if(m==0) return 0 ;
        if (m>n) return -1 ;
        for(int i =0 ;;i++){
            for(int j=0;;j++){
                if(j==m) return i ;
                if(i+j==n) return -1 ;
                if(haystack.charAt(i+j)!=needle.charAt(j)) break;
            }
        }
    }
}
