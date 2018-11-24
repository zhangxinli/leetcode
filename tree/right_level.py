#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-22 10:50:35
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$

class Solution:
    def rightSideView(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        if not root:
            return []
        res=[]
        self.helper(root,0,res)
        return res
    
    def helper(self,node,level,res):
        if not node :
            return 
        if len(res)==level:
            res.append(node.val)
        
        self.helper(node.right,level+1,res)
        self.helper(node.left,level+1,res)
