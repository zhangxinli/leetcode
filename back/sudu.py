#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-18 22:29:30
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$

class Solution:
    def isValidSudoku(self, board):
        """
        :type board: List[List[str]]
        :rtype: bool
        """
        if not board :
            return False
        m = len(board)
        n = len(board[0])
        
        row_vaild = [ [False for i in range(n)] for j in range(m)]
        col_vaild = [ [False for i in range(n)] for j in range(m)]
        mix_vaild = [ [False for i in range(n)] for j in range(m)]
        
        for i in range(m):
            for j in range(n):
                if board[i][j] =='.':
                    continue
                value = int(board[i][j]) -1
                
                if row_vaild[i][value]:
                    return False
                if col_vaild[value][j]:
                    return False
                index = (i//3)*3 +j//3
                if mix_vaild[index][value]:
                    return False
                row_vaild[i][value]=True
                col_vaild[value][j]=True
                mix_vaild[index][value]=True
        return True
