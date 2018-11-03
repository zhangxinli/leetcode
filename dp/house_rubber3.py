#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-03 15:34:49
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$

def rob(root):
    """
    :type root: TreeNode
    :rtype: int
    """
    if not root:
        return 0 
    if  (not root.left) and (not root.right):
        return root.val
    left =0
    sub_left =0
    right=0
    sub_right=0
    if  root.left:
        left = rob(root.left)
        sub_left =rob(root.left.left)+rob(root.left.right)
    if  root.right:
        right = rob(root.right)
        sub_right =rob(root.right.left)+rob(root.right.right)
    if(left+right>sub_left+sub_right+root.val):
        return left+right
    else:
            return sub_left+sub_right+root.val
        
