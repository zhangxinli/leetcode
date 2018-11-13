#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-13 15:00:31
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$

class Solution:
    def canCompleteCircuit(self, gas, cost):
        """
        :type gas: List[int]
        :type cost: List[int]
        :rtype: int
        """
        if not gas or not cost:
            return -1
        if sum(gas) < sum(cost):
            return -1
        length = len(gas)
        total = 0
        station = 0
        for i in range(length):
            if total + gas[i] < cost[i]:
                total = 0
                station = i + 1
            else:
                total += gas[i] - cost[i]
        return station
        
#         length = len(gas)
        
#         for i in range(length):
#             remain = 0 
#             cur_index = i 
#             while remain+gas[cur_index]>=cost[cur_index]:
#                 remain = remain+gas[cur_index]-cost[cur_index]
#                 if cur_index== length-1:
#                     cur_index =0 
#                 else:
#                     cur_index+=1
                
#                 if i ==cur_index:
#                     return i
        
#         return -1
        
