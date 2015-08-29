package restart.array;

import java.util.Arrays;

public class TwoSum2 {
	public int[] solution(int[] nums,int target){
		if(nums==null||nums.length==0||nums.length==1) return null ;
		int res[] =new int[2] ;
		Arrays.sort(nums);
		int start =0 ;
		int end =nums.length-1 ;
		while(start<=end){
			if(nums[start]+nums[end]==target){
				res=new int[]{start,end} ;
				return res ;
			}else if(nums[start]+nums[end]<target){
				start++ ;
			}else{
				end-- ;
			}
		}
		return null ;
	}
}
