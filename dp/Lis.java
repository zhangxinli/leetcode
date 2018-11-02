package com.zxl.dp;

public class Lis {
	public static  int getMaxLis(int[] nums){
		
		if(nums==null||nums.length==0) return 0 ;
		int[] d= new int[nums.length] ;
		d[0] =1 ;
		int res = 1 ;
		for(int i =1 ;i<nums.length;i++){
			d[i]=1;
			for(int j=0;j<i;j++){
				if(nums[i]>nums[j]&&d[i]-1<d[j]){
					d[i]=d[j]+1;
				}
			}
			
			res = res >= d[i] ?res:d[i] ;
			System.out.println(res);
		}
		return res ;
	}
	public static void main(String[] args) {
		System.out.println(getMaxLis(new int[]{5,3,4,8,6,7}));
	}
}	
