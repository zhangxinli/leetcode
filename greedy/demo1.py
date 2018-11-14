#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-14 16:08:45
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$

class Solution:
    def candy(self, ratings):
        """
        :type ratings: List[int]
        :rtype: int
        """
        if not ratings :
            return 0
        candies = [1 for i in range(len(ratings))] 
        
        for i in range(1,len(ratings)):
            if ratings[i]>ratings[i-1]:
                candies[i] =candies[i-1]+1
            
        for i in range(len(ratings)-2,-1,-1):
            if ratings[i] > ratings[i+1]:
                candies[i] = max(candies[i],candies[i+1]+1)
                
        return sum(candies)
        