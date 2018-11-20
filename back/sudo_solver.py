#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-20 15:23:08
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$

class Solution:
    def solveSudoku(self, board):
        """
        :type board: List[List[str]]
        :rtype: void Do not return anything, modify board in-place instead.
        """
        if not board :
            return False 
        row_list = [[False for i in range(len(board[0]))] for j in range(len(board))]
        col_list = [[False for i in range(len(board[0]))] for j in range(len(board))]
        mix_list = [[False for i in range(len(board[0]))] for j in range(len(board))]
        
        for i in range(len(board)):
            for j in range(len(board[0])):
                if board[i][j]!='.':
                   
                    value = int(board[i][j])-1
                    row_list[i][value] =True
                    col_list[value][j]=True
                    index_i = (i//3)*3 +value//3
                    index_j =(j//3)*3 +value%3
                 
                    mix_list[index_i][index_j]=True

        self.helper(board,row_list,col_list,mix_list,0,0)
        
        
    def helper(self,board,row_list,col_list,mix_list,row,col):
        i = row
        j = col
        m = len(board)
        n = len(board[0])
        while i< m:
            if j > n-1:
                i+=1
                j=0
            else:
                if board[i][j] == '.':
                    for num in range(n):
                        index_i = (i//3)*3+num//3
                        index_j = (j//3)*3+num%3
                        if not row_list[i][num] and not col_list[num][j] and not mix_list[index_i][index_j]:
                            board[i][j]=str(num+1)
                            row_list[i][num]=True
                            col_list[num][j]=True
                            mix_list[index_i][index_j]=True
                            if j < n-1:
                                if self.helper(board,row_list,col_list,mix_list,i,j+1):
                                    return True
                            else:
                                if self.helper(board,row_list,col_list,mix_list,i+1,0):
                                    return True
                            board[i][j]='.'
                            row_list[i][num]=False
                            col_list[num][j]=False
                            mix_list[index_i][index_j]=False
                    return False
                else:
                    j+=1
        return True
