#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-20 19:53:36
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$
class Solution:
    def solveNQueens(self, n):
        """
        :type n: int
        :rtype: List[List[str]]
        """
        if not n :
            return []
        # is_exists=[[False for i in range(n)] for j in range(n)]
        res=[]
        self.helper(res,[],n,0)
        return res
        
        
    def helper(self,res,temp_list,n,cur_index):
        if len(temp_list)==n:
            # print(is_exists)
            res.append(list(temp_list))
            return 
        strs =''
        for i in range(n):
            strs+='.'
            
        for i in range(n):
            if self.is_exist(temp_list,cur_index,i,n):
                continue
            temp=list(strs)
            temp[i]='Q'
            strs1=''.join(temp)
            temp_list.append(strs1)
            print(strs1)
            self.helper(res,temp_list,n,cur_index+1)
            temp_list.pop()
            # temp=list(strs)
            # temp[i]=='.'
            # strs=''.join(temp)
    # def pruduce_str(self,i,n):
            
    def is_exist(self,temp_list,i,j,n):
        k = 0
        
        while k<i:
            if temp_list[k][j]=='Q':
                return True
            k+=1
        k=1 
        while i-k>=0 and j-k>=0:
            if temp_list[i-k][j-k]=='Q':
                return True
            k+=1
       
        k=1
        while i-k>0 and j+k<n:
            if temp_list[i-k][j+k]=='Q':
                return True
            k+=1
      
        return False