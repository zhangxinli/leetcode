#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-16 12:16:58
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$

class Solution:
    def permuteUnique(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if not nums:
            return []
        used = [False for i in range(len(nums))]
        res =[]
        nums.sort()
        self.premute_helper(res,[],used,nums)
        return res
        
    def premute_helper(self,res,cur_list,used,nums):
        if len(cur_list)== len(nums):
            res.append(list(cur_list))
            return
        
        for i in range(len(nums)):
            if i!=0 and used[i-1]==False and nums[i]==nums[i-1]:
                continue
            if used[i] ==False:
                cur_list.append(nums[i])
                used[i] =True
                self.premute_helper(res,cur_list,used,nums)
                cur_list.pop()
				used[i] =False