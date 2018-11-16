#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-16 10:52:32
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$

class Solution:
    def subsets(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if not nums or len(nums)==0:
            return []
        res = []
        res.append([])
        nums.sort()
        for i in range(len(nums)):
            for j in range(len(res)):
                temp = [] 
                temp.extend(res[j])
                temp.append(nums[i])
                res.append(temp)
        return res



    def subset_helper(res,cur_list,nums,index)
    	lists = list(cur_list)
    	res.append(lists)

    	for i in range(index,len(nums)):
    		cur_list.append(nums[i])
    		subset_helper(res,cur_list,nums,index+1)
    		cur_list.pop()