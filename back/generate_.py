#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-14 20:02:27
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$


class Solution:
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        if n==0:
            return ''
       
        
        res=[]
        self.generate(0,0,res,n,'')
        return res
    
    def generate(self,left,right,res,n,temp):
        if len(temp) == n*2 :
            res.append(temp)
            return
        
        if left < n :
            self.generate(left+1,right,res,n,temp+'(')
        if right <left:
            self.generate(left,right+1,res,n,temp+')')
        
        