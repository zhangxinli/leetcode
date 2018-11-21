#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-21 10:56:09
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$

class Solution:
    def minCut(self, s):
        """
        :type s: str
        :rtype: int
        """
        if not s:
            return 0
        m= len(s)
        isPalindromes=[[False for i in range(m) ] for j in range(m)]
        cut=[0 for i in range(m)]
        
        for i in range(m):
            min_=i
            for j in range(i+1):
                if s[i]==s[j] and (j+1>i-1 or isPalindromes[j+1][i-1]):
                    isPalindromes[j][i]=True
                    if j==0:
                        min_=0
                    else:
                        min_ = min(min_,cut[j-1]+1)
            cut[i]=min_
        return cut[m-1]
