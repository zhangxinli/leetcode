#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-18 16:24:36
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$

class Solution:
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        if not nums :
            return 
        if len(nums)==0 or len(nums)==1:
            return 
        
        i = len(nums)-2
        while i>=0 :
            if nums[i] < nums[i+1]:
                break
            i-=1 
        if i ==-1:
            nums.reverse()
            return
        j=i+1
        while j <  len(nums)-1:
            if nums[j] > nums[i] and nums[j+1] <= nums[i]:
                break
            j+=1 
        print(i,j)
        temp= nums[i]
        nums[i] = nums[j]
        nums[j]= temp 
        nums[i+1:len(nums)] = nums[len(nums)-1:i:-1]
        
