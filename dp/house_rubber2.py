#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-03 14:08:17
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$

def rob( nums):
	"""
	:type nums: List[int]
	:rtype: int
	"""

	nums_len = len(nums)
	if nums_len==1:
            return nums[0];
	dp1= [0 for i in range(nums_len)]
	dp2= [0 for i in range(nums_len)]
	dp1_1 =0
	dp1_2 =0
	dp2_1=0
	dp2_2 =0
	max_res=0
	for i in range(nums_len):
		if i>0:
			dp1[i]=dp1_1+nums[i]
			dp1_1 =max(dp1_1,dp1_2)
			dp1_2 = dp1[i]
			max_res = max(max_res,dp1[i])

		if i<nums_len-1:
			dp2[i]=dp2_1+nums[i]
			dp2_1 =max(dp2_1,dp2_2)
			dp2_2 = dp2[i]
			max_res = max(max_res,dp2[i])
	return max_res


print(rob([2,1,1,2]))