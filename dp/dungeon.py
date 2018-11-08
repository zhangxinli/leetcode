#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-08 15:36:22
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$

class Solution:
    def calculateMinimumHP(self, dungeon):
        """
        :type dungeon: List[List[int]]
        :rtype: int
        """
        m = len(dungeon)
        n = len(dungeon[0])
        dp=[[0 for i in range(n)] for j in range(m)]
        for i in range(m-1,-1,-1):
            for j in range(n-1,-1,-1):
               
                if i==m-1 and j==n-1:
                    print(123)
                    dp[i][j]= max(1-dungeon[i][j],1)
                elif j==n-1:
                    dp[i][j]=max(dp[i+1][j]-dungeon[i][j],1)
                elif i==m-1:
                    dp[i][j]=max(dp[i][j+1]-dungeon[i][j],1)
                else:
                    right =max(dp[i][j+1]-dungeon[i][j],1)
                    down=max(dp[i+1][j]-dungeon[i][j],1)
                    dp[i][j]=min(right,down)
        print(dp)
        return dp[0][0]
					
