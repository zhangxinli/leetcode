package com.zxl.twoPoint;

public class RemoveDeplicates {
	  public int removeDuplicates(int[] nums) {
	        int numDupes = 0;
	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] == nums[i-1]) {
	                numDupes++;
	            } else {
	                nums[i-numDupes] = nums[i];
	            }
	        }
	        return nums.length - numDupes;
	    }
}
