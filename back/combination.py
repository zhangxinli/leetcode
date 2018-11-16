#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-16 14:18:18
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$

class Solution:
    def combine(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: List[List[int]]
        """
        if not n or not k or k>n:
            return []
        res=[]
        self.combine_helper(n,k,res,[],0)
        return res
        
    def combine_helper(self,n,k,res,cur_list,index):
        if len(cur_list) == k:
            res.append(list(cur_list))
            return 
        
        for i in range(index,n):
            cur_list.append(i+1)
            self.combine_helper(n,k,res,cur_list,i+1)
            cur_list.pop()
