#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-04 19:07:57
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$

class Solution:
    def wordBreak(self, s, wordDict):
        """
        :type s: str
        :type wordDict: List[str]
        :rtype: bool
        """
        
        lens = len(s)
        dp=[False for i in range(lens+1)]
        
        dp[0]=True
        
        for i in range(1,lens+1):
            
            for j in range(i):
                
                if dp[j] and s[j:i] in wordDict:
                    dp[i]=True
        print(dp)
        return dp[-1]
        