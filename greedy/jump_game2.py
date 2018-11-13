#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-13 14:37:01
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$

class Solution:
    def jump(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        length = len(nums)
        if length <= 1 :
            return 0
        
        cur_start = 0
        end =0 
        cur_step =0
        
        while cur_start <= end:
            cur_end = end 
            
            for i  in range(cur_start ,cur_end+1):
                if i+nums[i]>= length-1:
                    return cur_step+1
                end = max(end,i+nums[i])
            cur_start=cur_end
            cur_step+=1
        return 0
        
        
        
        
        
        
        
#动态规划，超时        
#         dp = [0 for i in range(len(nums))]
        
#         for i in range(len(nums)-2,-1,-1):
#             if nums[i]+i >=len(nums)-1:
#                 dp[i]= 1
#             else:
#                 j =1
#                 min_value =sys.maxsize
#                 while j<=nums[i]:
#                     min_value = min(min_value,dp[i+j])
#                     j+=1
#                 dp[i] =min_value+1
#         return dp[0]
                    
        
        