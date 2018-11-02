#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-02 16:08:10
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$

import sys

def numSquares(n):

if not n :
	return 0
dp = [sys.maxsize for i in range(n+1)]

root =1 
while (root**2)<=n:
	dp[root*2] = 1
	root+=1


for i in range(1,n+1):
	root =1 

	while i+root*2 <= n:
		dp[i+root*2] = min(dp[i]+1,dp[i+root*2])
		root+=1 
return dp[n]



