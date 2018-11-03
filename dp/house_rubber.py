#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-03 13:51:44
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$

def rob( nums):
	num_len =len(nums)
	dp=[0 for i in range(num_len)]

	max_first=0
	max_second=0
	max_res=0 
	for i in range(num_len):
		dp[i]=max_first+nums[i]
		max_first=max(max_first,max_second)
		max_second=dp[i] 
		max_res= max(max_res,dp[i])
	print(dp)
	return max_res


rob([2,1,1,2])
      