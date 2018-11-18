#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-18 16:55:49
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$

class Solution:
    def getPermutation(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: str
        """
        if not k or not n:
            return ''
        nums = list(range(1,n+1))
        res=''
        k-=1
        while n>0:
            n-=1 
            index,k = divmod(k,math.factorial(n))
            res= res + str(nums[index])
            nums.remove(nums[index])
        return res
        