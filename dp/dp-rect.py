#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-02 21:18:24
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$


class Rect:
	def __init__(self,x,y):
		self.x =x 
		self.y =y



def getMaxRect(rects):
	lens = rects.length;
	dp =[[0 for i in range(lens+1)] for j in range(lens+1)]
	for i in range(1,lens+1):
		for j in range(1,lens+1):
			if(rects[i].x<rects[j].x and rects[i].y<rects[j].y):
				dp[i][j]=1

	max_len=0 
	best_i=0
	d = [0 for j in range(lens+1)]
	for i in range(1,lens+1):
		max_j=0
		for i in range(1,lens+1):
			if dp[i][j] :
				if max_j<d[j]:
					max_j=d[j]
		d[i]=max_j+1

		if(max_len<d[i]):
			max_len=d[i]
			best_i=i
	



