package com.zxl.twoPoint;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {

	public int[] getTwoSum(int[] num,int target){
		if ( num == null || num.length == 1 ){
			return null ;
		}
		int[] newNum = new int[num.length] ;
		System.arraycopy(num, 0, newNum, 0, num.length) ;
		Arrays.sort(newNum) ;
		int i=0,j =newNum.length-1 ;
		while(i<=j){
			if(newNum[i]+newNum[j]>target) j--;
			
			else if(newNum[i]+newNum[j]<target) i++ ;
			
			else break;
		}
		
		int[] res = new int[2] ;
		int index1 = 0 ;
		for(int index = 0 ;index<=num.length ;index++){
			if(num[index]== newNum[i] || num[index]== newNum[j]) {
				res[index1++] = index ;
			}
		}
		
		return res ;
	}
}
