package com.zxl.twoPoint;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int front = 0,tail = nums.length-1;
		while(front <= tail)
		{
		if(nums[front] == val && nums[tail] != val)
		{
		nums[front] = nums[tail];
		nums[tail] = val;
		}
		if(nums[front] != val) front++;
		if(nums[tail] == val) tail--;
		}
		return tail+1;
		}
}
