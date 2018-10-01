package com.zxl.twoPoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums == null || nums.length <3){
            return res ;
        }
        Arrays.sort(nums);
        for(int i =0; i<nums.length && nums[i]<=0 ; i++){
            int left = i+1;
            int right = nums.length-1 ;
            while(left<=right){
                if(nums[left]+nums[right]==-nums[i]){
                    int left_num= nums[left] ;
                    int right_num=nums[right];
                    res.add(Arrays.asList(nums[i],nums[left++],nums[right--]));
                    while(left<nums.length&&nums[left]==left_num) left++;
                    while(right>0&&nums[right]==right_num)  right--;
                }else if(nums[left]+nums[right]<-nums[i]){
                    left++;
                }else if(nums[left]+nums[right]>-nums[i]){
                    right--;
                }
            }
            while(i<nums.length-1&&nums[i]==nums[i+1]) i++;
        }
        return res;
            
        
    }
	
	public static void main(String[] args) {
		System.out.println(threeSum(new int[]{-1,-1,0,1}));
	}
}


