#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-23 10:21:46
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$

class Solution:
    # @param root, a tree link node
    # @return nothing
    def connect(self, root):
        if not root:
            return
        
        result = []
        result.append(root)
        while len(result)>0:
            size = len(result)
            # print('------+----'+str(size))
            for i in range(size):
                temp=result[0]
                print(temp.val)
                result.remove(temp)
                if i==size-1:
                    temp.next=None
                else:
                    temp.next=result[0]
                if temp.left:
                    result.append(temp.left)
                if temp.right:
                    result.append(temp.right)
