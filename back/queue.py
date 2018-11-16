#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-16 09:51:53
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$


global res
res =0  
def queue(n):
	if not n :
		return 0

	queue = [[False for i in range(n)] for j in range(n) ]
	global res
	back_queue(0,queue,n)
	return res


def back_queue(index,queue,n):
	global res
	print(index)
	print(queue)

	if index == n:
		res+=1 
		# print(str(res)+"---------")
		# print(queue)
		return 

	for i in range(n):
		j = 0
		for j in range(index+1):
			if queue[j][i]:
				break
		if j==index and not queue[j][i]:
			queue[index][i] =True
		else:
			continue
		back_queue(index+1,queue,n)
		queue[index][i] =False



