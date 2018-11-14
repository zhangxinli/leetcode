#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-14 19:26:27
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$

class Solution:
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        if not digits or len(digits)==0:
            return []
        
        res = []
        self.combine(res,'',digits,0)
        return res
     
    def combine(self,res,cur_str,digits,index):
        if index == len(digits):
            res.append(cur_str)
            return 
        
        num = int(digits[index])
        strs = self.getletterByNum(num)
        
      
        
        for i in range(len(strs)):
            self.combine(res,cur_str+strs[i],digits,index+1)
            
        
    
    def getletterByNum(self,num):
        digit={'0':'','2':'','2':'abc','3':'def','4':'ghi','5':'jkl','6':'mno','7':'pqrs','8':'tuv','9':'wxyz'}
        return digit[str(num)]