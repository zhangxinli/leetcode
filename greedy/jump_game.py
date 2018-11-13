#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-13 14:02:47
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$

class Solution:
    def canJump(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        
        if not nums :
            return False
        
        maxLen = 0 
        for i  in range(len(nums)):
            if i <= maxLen:
                maxLen= max(maxLen,i+nums[i])
        return maxLen>= len(nums)-1
        
