#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-14 16:28:49
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$

class Solution:
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        if not nums:
            return []
        
        res = [1 for i in range(len(nums))]
        
        temp_left =1 
        for i in range(len(nums)):
            res[i] = res[i]*temp_left
            temp_left= temp_left*nums[i]
        print(res) 
        temp_right =1 
        for i in range(len(nums)-1,-1,-1):
            res[i] = res[i]*temp_right
            temp_right= temp_right*nums[i]
        return res
