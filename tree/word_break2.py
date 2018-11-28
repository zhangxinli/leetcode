#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-25 16:32:40
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$

class Solution:
    def wordBreak(self, s, wordDict):
        """
        :type s: str
        :type wordDict: List[str]
        :rtype: List[str]
        """
        
        if not s or not wordDict:
            return []
        # res=[]
        return self.helper(s,wordDict,{})
        
        
                
    def helper(self,s,wordDict,memo):
        
        
        if s in memo: return memo[s]
        if not s: return []

        res = []
        for word in wordDict:
            if not s.startswith(word):
                continue
            if len(word) == len(s):
                res.append(word)
            else:
                resultOfTheRest = self.helper(s[len(word):], wordDict, memo)
                for item in resultOfTheRest:
                    item = word + ' ' + item
                    res.append(item)
        memo[s] = res
        return res
#         if not s:
#             return 
#         for word in wordDict:
#             if s.startswith(word):
#                 if len(cur_str)==0:
#                     strs=word
#                 else:
#                     strs=cur_str+' '+word
#                 if len(s)==len(word):
#                     res.append(strs)
                    
#                 else:
#                     self.helper(s[len(word):],wordDict,res,strs)
                
                    
        
        
